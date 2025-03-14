package org.example;

import java.time.LocalDate;

public class FuncionesParaTestear {

    // Operaciones matemáticas básicas
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        return (double) a / b;
    }

    // Operaciones con cadenas
    public static boolean esCadenaVacia(String texto) {
        return texto == null || texto.isEmpty();
    }

    public static String invertirCadena(String texto) {
        if (texto == null) return "";
        return new StringBuilder(texto).reverse().toString();
    }

    public static boolean esPalindromo(String texto) {
        if (texto == null) return false;
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        return limpio.equals(invertirCadena(limpio));
    }

    // Operaciones booleanas
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Operaciones con arrays
    public static int sumarArray(int[] numeros) {
        int suma = 0;
        for (int num : numeros) suma += num;
        return suma;
    }

    public static boolean contieneValor(int[] numeros, int valor) {
        for (int num : numeros) if (num == valor) return true;
        return false;
    }

    public static int encontrarMaximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) throw new IllegalArgumentException();
        int max = numeros[0];
        for (int num : numeros) if (num > max) max = num;
        return max;
    }

    // Operaciones con fechas
    public static int obtenerAnioActual() {
        return LocalDate.now().getYear();
    }

    public static boolean esFechaBisiesta(int año) {
        return java.time.Year.of(año).isLeap();
    }

    // Operaciones de validación
    public static boolean validarEmail(String email) {
        if (email == null) return false;
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static boolean validarTarjetaCredito(String numero) {
        if (numero == null) return false;
        return numero.matches("^\\d{16}$");
    }
}