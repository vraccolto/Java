package org.example.model;

import org.example.enums.FormaPagamento;
import org.example.enums.TipoOperacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityId implements OperacaoFinanceira {
    private LocalDate dataVenda;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private String observacao;
    private List<ItemVenda> itens = new ArrayList<>();

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void addItemVenda(ItemVenda item) { this.itens.add(item); }

    public void delItemVenda(ItemVenda item) {
        this.itens.remove(item);
    }

    public List<ItemVenda> getItens() { return itens; }

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", cliente=" + cliente +
                ", formaPagamento=" + formaPagamento +
                ", observacao='" + observacao + '\'' +
                ", itens=" + itens +
                '}';
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream()
                .mapToDouble(ItemVenda::getValorUnitario)
                .sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}
