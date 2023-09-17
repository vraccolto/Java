// NÃO É UMA BOA PRÁTICA ACESSAR ATRIBUTOS DIRETAMENTE

package org.example.model;
import org.example.enums.Status;

import java.time.LocalDate;

public class ProdutoAcessoDiretoAtributos {
    public Integer id;
    public String nome;
    public String descricao;
    public Double precoVenda;
    public Double precoCompra;
    public LocalDate dataValidade;
    public LocalDate dataPrazo;
    public Status status;
}
