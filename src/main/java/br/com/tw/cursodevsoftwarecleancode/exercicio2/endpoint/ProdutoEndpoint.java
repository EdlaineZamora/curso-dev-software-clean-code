package br.com.tw.cursodevsoftwarecleancode.exercicio2.endpoint;

import br.com.tw.cursodevsoftwarecleancode.exercicio2.dominio.ProdutoService;
import br.com.tw.cursodevsoftwarecleancode.exercicio2.dominio.Produto;

public class ProdutoEndpoint {

    private ProdutoService produtoService = new ProdutoService();

    public void imprimirInformacoesDoProduto(ProdutoRequest produtoRequest) {
        Produto produto = new Produto(produtoRequest);

        produtoService.imprimirInformacoesDoProduto(produto);
    }

}
