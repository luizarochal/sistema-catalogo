package main;

import domain.Catalogo;
import domain.Produto;
public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        
        Produto p1 = new Produto("Smartphone", "001", 1500.0, "Smartphone com 128GB de armazenamento.");
        Produto p2 = new Produto("Notebook", "002", 3500.0, "Notebook com processador i7 e 16GB de RAM.");
        
        catalogo.adicionarProduto(p1);
        catalogo.adicionarProduto(p2);

        catalogo.exibirTodosProdutos();

        catalogo.consultarPreco("Smartphone");

        catalogo.removerProduto("Notebook");

        catalogo.exibirTodosProdutos();
    }
}
