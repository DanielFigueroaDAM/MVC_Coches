package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // Test unico
    @Test
    @DisplayName("Test de multiplicacion")
    void testMultiplication() {
        assertEquals(40, Main.multiplicacion(5, 8));
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @DisplayName("Test de multiplicacion con parametros")
    @CsvSource({
            "1, 2, 2",
            "2, 3, 6",
            "3, 4, 12",
            "4, 5, 20",
            "5, 6, 30",
            "6, 7, 42",
            "7, 8, 56",
            "8, 9, 72",
            "9, 10, 90",
            "10, 11, 110"
    })
    void testMultiplication(int a, int b, int result) {
        assertEquals(result, Main.multiplicacion(a, b));
    }

}