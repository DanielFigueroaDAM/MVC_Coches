package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class FuncionesParaTestearTest {

    @Test
    @DisplayName("Sumar 3 + 4 = 7")
    void testSumar() {
        assertEquals(7, FuncionesParaTestear.sumar(3, 4));
    }

    @Test
    void restar() {
        assertEquals(2, FuncionesParaTestear.restar(5, 3));
    }

    @Test
    void multiplicar() {
        assertEquals(12, FuncionesParaTestear.multiplicar(3, 4));
    }

    @Test
    void dividir() {
        assertEquals(2.5, FuncionesParaTestear.dividir(5, 2));
    }

    @Test
    void esCadenaVacia() {
        assertFalse(FuncionesParaTestear.esCadenaVacia("hola"));
        assertTrue(FuncionesParaTestear.esCadenaVacia(""));

    }

    @Test
    void invertirCadena() {
        assertEquals("aloh", FuncionesParaTestear.invertirCadena("hola"));
    }

    @Test
    void esPalindromo() {
        assertTrue(FuncionesParaTestear.esPalindromo("Anita lava la tina"));
        assertFalse(FuncionesParaTestear.esPalindromo("Hola mundo"));
    }

    @Test
    void esPar() {
        assertTrue(FuncionesParaTestear.esPar(4));
        assertFalse(FuncionesParaTestear.esPar(3));
    }

    @Test
    void esPositivo() {
        assertTrue(FuncionesParaTestear.esPositivo(4));
        assertFalse(FuncionesParaTestear.esPositivo(-3));
    }

    @Test
    void esBisiesto() {
        assertTrue(FuncionesParaTestear.esBisiesto(2020));
        assertFalse(FuncionesParaTestear.esBisiesto(2021));
    }

    @Test
    void sumarArray() {
        int[] numeros = {1, 2, 3, 4, 5};
        assertEquals(15, FuncionesParaTestear.sumarArray(numeros));
    }

    @Test
    void contieneValor() {
        int[] numeros = {1, 2, 3, 4, 5};
        assertTrue(FuncionesParaTestear.contieneValor(numeros, 3));
        assertFalse(FuncionesParaTestear.contieneValor(numeros, 6));
    }

    @Test
    void encontrarMaximo() {
        int[] numeros = {1, 2, 3, 4, 5};
        assertEquals(5, FuncionesParaTestear.encontrarMaximo(numeros));
    }

    @Test
    void obtenerAnioActual() {
        assertEquals(2025, FuncionesParaTestear.obtenerAnioActual());

    }

    @Test
    void esFechaBisiesta() {
        assertTrue(FuncionesParaTestear.esFechaBisiesta(2020));
        assertFalse(FuncionesParaTestear.esFechaBisiesta(2021));
    }

    @Test
    void validarEmail() {
        assertTrue(FuncionesParaTestear.validarEmail("bienvenido@hotmail.es"));
        assertFalse(FuncionesParaTestear.validarEmail("hola.com"));

    }

    @Test
    void validarTarjetaCredito() {
        assertTrue(FuncionesParaTestear.validarTarjetaCredito("1234567890123456"));
    }
    @ParameterizedTest
    @CsvSource({
            // Tabla de parámetros (entrada1, entrada2, resultadoEsperado)
            "2, 3, 5",
            "-5, 10, 5",
            "0, 0, 0",
            "-7, -3, -10",
            "1000, 2000, 3000",
            "123, -123, 0",
            "0, 42, 42"
    })
    @DisplayName("Pruebas parametrizadas de suma")
    void testSumar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, FuncionesParaTestear.sumar(a, b));
    }


}