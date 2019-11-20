package br.com.tw.cursodevsoftwarecleancode.exercicio2.dominio;

import br.com.tw.cursodevsoftwarecleancode.exercicio2.endpoint.ProdutoRequest;

import java.math.BigDecimal;

import static java.util.Objects.isNull;

public class Produto {
    private final String descricao;
    private final BigDecimal valor;

    public Produto(ProdutoRequest produtoRequest) {
        checkDescricao(produtoRequest.getDescricao());

        this.descricao = produtoRequest.getDescricao();
        this.valor = produtoRequest.getValor();
    }

    private void checkDescricao(String descricao) {
        if (isNull(descricao)) {
            throw new RuntimeException("Bad Request");
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Descrição do produto: " + descricao);

        if (valor.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("O produto está de graça");
        } else {
            System.out.println("Valor do produto: " + valor);
        }
    }
}
