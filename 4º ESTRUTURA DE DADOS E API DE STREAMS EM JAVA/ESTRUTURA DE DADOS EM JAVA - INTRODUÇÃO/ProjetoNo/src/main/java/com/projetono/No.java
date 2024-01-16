package com.projetono;

public class No<T> {
    // Refatorando a classe No
    // <T> corresponde a falar para a classe receber qualquer tipo generico
    private T conteudo; // Antes era - String conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
