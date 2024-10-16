package test;

import org.junit.Before;
import org.junit.Test;

import domain.Catalogo;
import domain.Produto;

import static org.junit.Assert.*;

public class CatalogoTest {

    private Catalogo catalogo;
    private Produto produto1;

    @Before
    public void setUp() {
        catalogo = new Catalogo();
        produto1 = new Produto("Smartphone", "001", 1500.0, "Smartphone com 128GB de armazenamento.");
    }

    @Test
    public void testAdicionarProduto() {
        catalogo.adicionarProduto(produto1);
        assertEquals(1, catalogo.getProdutos().size());
        assertTrue(catalogo.getProdutos().containsKey("Smartphone"));
    }

    @Test
    public void testAtualizarProduto() {
        catalogo.adicionarProduto(produto1);
        Produto novoSmartphone = new Produto("Smartphone", "003", 1800.0, "Smartphone com 256GB de armazenamento.");
        catalogo.adicionarProduto(novoSmartphone);

        Produto produtoAtualizado = catalogo.getProdutos().get("Smartphone");
        assertEquals(1800.0, produtoAtualizado.getPreco(), 0.01);
        assertEquals("003", produtoAtualizado.getCodigo());
    }

    @Test
    public void testRemoverProduto() {
        catalogo.adicionarProduto(produto1);
        catalogo.removerProduto("Smartphone");
        assertFalse(catalogo.getProdutos().containsKey("Smartphone"));
    }

    @Test
    public void testRemoverProdutoInexistente() {
        catalogo.removerProduto("Tablet");
        assertEquals(0, catalogo.getProdutos().size());
    }
}

