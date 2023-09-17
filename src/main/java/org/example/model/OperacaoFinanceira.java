package org.example.model;

import org.example.enums.TipoOperacao;

import java.time.LocalDate;

public interface OperacaoFinanceira {
    public LocalDate getDataOperacao();
    public Double getValorTotalOperacao();
    public TipoOperacao getTipoOperacao();
}
