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

    @Test
    void fimNegativo(){
        int numero = aleatorio.gerarNumeroAleatorio(2,-1);
        assertEquals(-1, numero);
    }

    @Test
    void inicioIgualAoFim(){
        int numero = aleatorio.gerarNumeroAleatorio(5, 5);
        assertEquals(-1, numero);
    }

    @Test
    void intervaloValido(){
        int numero = aleatorio.gerarNumeroAleatorio(200, 3000);
        assertTrue(numero >= 200  && numero <= 3000, "numero fora do intervalo: " + numero);
    }





    


}