package ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitarioTest {
    private Utilitario utilitario;

    @BeforeEach
    void setUp() {
        utilitario = new Utilitario();

    }

    @Test
    void vetorCrescente() throws Exception {

        int [] v = {1,2,3,4,5,6};
        Extremos resultado = utilitario.acharExtremos(v);

        assertEquals(1, resultado.getMenor());
        assertEquals(0, resultado.getIndiceMenor());
        assertEquals(6, resultado.getMaior());
        assertEquals(5, resultado.getIndiceMaior());
    }

    @Test
    void vetor2()throws Exception{
        int [] v = {1, 99, 3, -5, 8};
        Extremos resultado = utilitario.acharExtremos(v);

        assertEquals(-5, resultado.getMenor());
        assertEquals(3, resultado.getIndiceMenor());
        assertEquals(99, resultado.getMaior());
        assertEquals(1, resultado.getIndiceMaior());
    }

    @Test
    void vetorVazio()throws Exception{
        int [] v = {};
        Exception e = assertThrows(Exception.class, () -> utilitario.acharExtremos(v));
        assertEquals("vetor com zero elementos", e.getMessage());
    }

    @Test
    void vetorNulo()throws Exception{
        int [] v = null;
        Exception e = assertThrows(Exception.class, () -> utilitario.acharExtremos(v));
        assertEquals("vetor nao pode ser nulo", e.getMessage());
    }


}