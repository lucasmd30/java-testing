package ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AleatorioTest {
    private Aleatorio aleatorio;

    @BeforeEach
    void setUp() {
        aleatorio = new Aleatorio();
    }


    @Test
    void inicioNegativo() {
        int numero = aleatorio.gerarNumeroAleatorio(-5,10);

        assertEquals(-1, numero);
    }


}