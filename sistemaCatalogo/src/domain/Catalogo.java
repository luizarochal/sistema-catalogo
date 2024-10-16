package domain;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {
    private Map<String, Produto> produtos;

    public Catalogo() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
        System.out.println("Produto adicionado/atualizado com sucesso!");
    }

    public void removerProduto(String nomeProduto) {
        if (produtos.containsKey(nomeProduto)) {
            produtos.remove(nomeProduto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void consultarPreco(String nomeProduto) {
        Produto produto = produtos.get(nomeProduto);
        if (produto != null) {
            System.out.println("Preço do produto '" + nomeProduto + "': " + produto.getPreco());
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void exibirTodosProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos.values()) {
                System.out.println(produto);
            }
        }
    }

    public Map<String, Produto> getProdutos() {
        return produtos;
    }
}
