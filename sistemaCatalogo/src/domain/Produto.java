package domain;

    public class Produto implements IProduto {
        private String nome;
        private String codigo;
        private double preco;
        private String descricao;
    
        public Produto(String nome, String codigo, double preco, String descricao) {
            this.nome = nome;
            this.codigo = codigo;
            this.preco = preco;
            this.descricao = descricao;
        }
    
        @Override
        public String getNome() {
            return nome;
        }
    
        @Override
        public String getCodigo() {
            return codigo;
        }
    
        @Override
        public double getPreco() {
            return preco;
        }
    
        @Override
        public String getDescricao() {
            return descricao;
        }
    
        @Override
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        @Override
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
    
        @Override
        public void setPreco(double preco) {
            this.preco = preco;
        }
    
        @Override
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    
        @Override
        public String toString() {
            return "Produto: " + nome + " | Código: " + codigo + " | Preço: " + preco + " | Descrição: " + descricao;
        }
    }