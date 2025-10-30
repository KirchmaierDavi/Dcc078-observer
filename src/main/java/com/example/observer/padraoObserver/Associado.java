package com.example.observer.padraoObserver;

public class Associado implements Observador {
    private String nome;
    private String ultimaNoticia;

    public Associado(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        this.ultimaNoticia = mensagem;
        System.out.println(nome + " recebeu a notícia: " + mensagem);
    }

    public String getUltimaNoticia() {
        return ultimaNoticia;
    }
}
