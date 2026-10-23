package ex02;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomatoriaTest {
    private MathOps mathOps;
    private Somatoria somatoria;

    @BeforeEach
    void setUp() {
        mathOps = mock(MathOps.class);
        somatoria = new Somatoria(mathOps);
    }

    @Test
    void vetorComTresEQuatro() {
        when(mathOps.fatorial(3)).thenReturn(6);
        when(mathOps.fatorial(4)).thenReturn(24);

        int resultado = somatoria.somaDeFatoriais(new int[]{3, 4});

        assertEquals(30, resultado);
        verify(mathOps, times(2)).fatorial(anyInt());
        verify(mathOps).fatorial(3);
        verify(mathOps).fatorial(4);
    }

    @Test
    void vetorDeZeroAQuatro() {
        when(mathOps.fatorial(0)).thenReturn(1);
        when(mathOps.fatorial(1)).thenReturn(1);
        when(mathOps.fatorial(2)).thenReturn(2);
        when(mathOps.fatorial(3)).thenReturn(6);
        when(mathOps.fatorial(4)).thenReturn(24);

        int resultado = somatoria.somaDeFatoriais(new int[]{0, 1, 2, 3, 4});

        assertEquals(34, resultado);
        verify(mathOps, times(5)).fatorial(anyInt());
    }
}
