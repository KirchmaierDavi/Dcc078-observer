package com.example.observer.padraoObserver;

public interface Assunto {
    void registrarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}

