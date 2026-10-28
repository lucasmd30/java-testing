package ex03;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomatoriaTest {
    private MathOps mathops;
    private Primo primo;
    private Somatoria somatoria;

    @BeforeEach
    void setUp(){
        primo = mock(Primo.class);
        mathops = mock(MathOps.class);
        somatoria = new Somatoria(mathops);
    }


    @Test
    void primeiroArray() {
        int [] v = {5,10};
        when(primo.ehPrimo(5)).thenReturn(true);
        when(primo.ehPrimo(10)).thenReturn(false);
        when(mathops.fatorial(10)).thenReturn(3628800);

        int resultado = somatoria.somaDeFatoriais(v, primo);

        assertEquals(3628800, resultado);
    }

    @Test
    void segundoArray(){
        int [] v = {3, 4, 4, 5};
        when(primo.ehPrimo(3)).thenReturn(true);
        when(primo.ehPrimo(4)).thenReturn(false);
        when(primo.ehPrimo(5)).thenReturn(true);
        when(mathops.fatorial(4)).thenReturn(24);

        int resultado = somatoria.somaDeFatoriais(v, primo);

        assertEquals(48, resultado);
    }


}
