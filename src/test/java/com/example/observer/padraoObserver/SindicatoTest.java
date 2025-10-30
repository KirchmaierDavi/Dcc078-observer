package com.example.observer.padraoObserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SindicatoTest {

    @Test
    public void quandoMudarNoticia_DeveNotificarAssociados() {
        Sindicato sindicato = new Sindicato();
        Associado associado1 = new Associado("João");
        Associado associado2 = new Associado("Maria");

        sindicato.registrarObservador(associado1);
        sindicato.registrarObservador(associado2);

        sindicato.novaNoticia("Nova convenção coletiva assinada.");

        assertEquals("Nova convenção coletiva assinada.", associado1.getUltimaNoticia());
        assertEquals("Nova convenção coletiva assinada.", associado2.getUltimaNoticia());
    }

    @Test
    public void quandoRemoverAssociado_NaoDeveNotificar() {
        Sindicato sindicato = new Sindicato();
        Associado associado1 = new Associado("José");
        Associado associado2 = new Associado("Ana");

        sindicato.registrarObservador(associado1);
        sindicato.registrarObservador(associado2);
        sindicato.removerObservador(associado2);

        sindicato.novaNoticia("Aumento de salário aprovado.");

        assertEquals("Aumento de salário aprovado.", associado1.getUltimaNoticia());
        assertNull(associado2.getUltimaNoticia());
    }
}

