package br.com.tw.cursodevsoftwarecleancode.exercise2;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;

public class ProdutoDTO {

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
