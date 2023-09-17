package org.example.model;

import org.example.enums.Status;
import java.time.LocalDate;

public class Produto extends ItemVendavel {
   private String nome;
   private Double precoCompra;
   private Double precoVenda;
   private LocalDate dataValidade;
   private LocalDate dataPrazo;
   private Status status;

   public Produto() {
   }

   public Produto(String nome, String descricao) {
      this.nome = nome;
      super.setDescricao(descricao);
   }

   public Produto(String nome, String descricao, Double valorUnitario) {
      this.nome = nome;
      super.setDescricao(descricao);
      super.setValorUnitario(valorUnitario);
   }


   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

//   public void setPrecoVenda(Double precoVenda) throws MargemLucroException {
//      super.setValorUnitario(precoVenda);
//      if (this.calculaMargemDeLucro() < 20.0) throw new MargemLucroException();
//   }

   public Double getPrecoCompra() {
      return precoCompra;
   }

   public void setPrecoCompra(Double precoCompra) {
      this.precoCompra = precoCompra;
   }

   public Double getPrecoVenda() { return precoVenda; }

   public void setPrecoVenda(Double precoVenda) { this.precoVenda = precoVenda; }

   public LocalDate getDataValidade() {
      return dataValidade;
   }

   public void setDataValidade(LocalDate dataValidade) {
      this.dataValidade = dataValidade;
   }

   public LocalDate getDataPrazo() {
      return dataPrazo;
   }

   public void setDataPrazo(LocalDate dataPrazo) {
      this.dataPrazo = dataPrazo;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public Double calculaMargemDeLucro() {
      double lucro = super.getValorUnitario() - precoCompra;
      double margemLucro = (lucro / super.getValorUnitario()) * 100;
      return margemLucro;
   }

   @Override
   public String toString() {
      return "Produto{" +
              "nome='" + nome + '\'' +
              '}';
   }
}
