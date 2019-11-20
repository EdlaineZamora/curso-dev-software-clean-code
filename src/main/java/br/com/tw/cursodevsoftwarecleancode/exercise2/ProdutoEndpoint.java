package br.com.tw.cursodevsoftwarecleancode.exercise2;

public class ProdutoEndpoint {

    private ProdutoService produtoService = new ProdutoService();

    public void salvar(ProdutoDTO produtoDTO) {
        if (!produtoDTO.possuiDadosValidos()) {
            throw new RuntimeException("Bad Request");
        }

        salvaProduto(produtoDTO);
    }

    private void salvaProduto(ProdutoDTO produtoDTO) {
        produtoService.salvar(produtoDTO);
    }

}
