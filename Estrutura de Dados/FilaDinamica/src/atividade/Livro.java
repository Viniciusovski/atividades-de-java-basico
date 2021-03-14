package atividade;


public class Livro {
    private String nome;
    private String autor;
    private String categoria;
    private Livro prox;

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Livro getProx() {
        return prox;
    }

    public void setProx(Livro prox) {
        this.prox = prox;
    }


}
