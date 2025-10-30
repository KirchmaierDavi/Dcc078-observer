package com.example.observer.padraoObserver;

import java.util.ArrayList;
import java.util.List;

public class Sindicato implements Assunto {
    private final List<Observador> observadores = new ArrayList<>();
    private String mensagem;

    @Override
    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    public void novaNoticia(String mensagem) {
        this.mensagem = mensagem;
        notificarObservadores();
    }
}

