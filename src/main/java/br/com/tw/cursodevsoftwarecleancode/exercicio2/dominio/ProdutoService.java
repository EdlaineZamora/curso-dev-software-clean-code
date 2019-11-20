package br.com.tw.cursodevsoftwarecleancode.exercicio2.dominio;

import java.math.BigDecimal;

public class ProdutoService {

    public void imprimirInformacoesDoProduto(Produto produto) {
        System.out.println("Descrição do produto: " + produto.getDescricao());

        if (produto.getValor().compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("O produto está de graça");
        } else {
            System.out.println("Valor do produto: " + produto.getValor());
        }
    }

}
