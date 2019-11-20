package br.com.tw.cursodevsoftwarecleancode.exercicio2.endpoint;

import br.com.tw.cursodevsoftwarecleancode.exercicio2.dominio.Produto;

public class ProdutoEndpoint {

    public void imprimirInformacoesDoProduto(ProdutoRequest produtoRequest) {
        Produto produto = new Produto(produtoRequest);

        produto.imprimirInformacoes();
    }

}
