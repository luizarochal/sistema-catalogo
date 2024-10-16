package domain;

interface IProduto {
    String getNome();
    String getCodigo();
    double getPreco();
    String getDescricao();
    
    void setNome(String nome);
    void setCodigo(String codigo);
    void setPreco(double preco);
    void setDescricao(String descricao);
}
