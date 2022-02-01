package br.ce.wcaquino.servicos;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculadoraMockTest {

    @Test
    public void test() {
        Calculadora calculadora = mock(Calculadora.class);
        when(calculadora.somar(eq(1), anyInt())).thenReturn(5);
    }

}
