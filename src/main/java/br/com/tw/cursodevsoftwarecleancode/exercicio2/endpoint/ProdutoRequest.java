package br.com.tw.cursodevsoftwarecleancode.exercicio2.endpoint;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;

public class ProdutoRequest {

    private String descricao;
    private BigDecimal valor;

    public boolean possuiDadosValidos() {
        return nonNull(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
