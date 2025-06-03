package com.equipo.proyecto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}
