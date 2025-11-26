package Calculadora;

public class Calculadora {

    private int somar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por ZERO (Operacao Invalida)");
        }
        return a / b;
    }

    public int calc(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operdaor invalido )" + operador);
        };
    }
}