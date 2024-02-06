package com.digitalinnovation;

public class No<T> {

    private T conteudo;
    private No<T> noProximo;

    // Criação do construtor
    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    //Geração dos métodos Getters e Setters
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    // Criação do método ToString
    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
