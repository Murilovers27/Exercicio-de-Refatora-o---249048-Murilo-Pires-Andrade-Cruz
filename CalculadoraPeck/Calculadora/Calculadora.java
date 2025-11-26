package Calculadora;

/**
 * Representa o motor de cálculos para as funcionalidades financeiras do aplicativo "FinançApp".
 * <p>
 * Esta classe é responsável por realizar as <b>quatro operações fundamentais</b>, isolando cada lógica em métodos privados.
 * O uso de métodos isolados é uma refatoração que melhora a manutenibilidade do código.
 * * @author Murilo Pires Andrade Cruz
 * @version 1.0
 * @since 1.0
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros.
     * <br>
     * Este é um método privado, acessado apenas internamente por {@link #calc(int, int, String)}.
     * @param a O <b>primeiro valor</b> a ser somado.
     * @param b O segundo valor a ser somado.
     * @return O resultado da soma (<code>a + b</code>).
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     * @param a O valor do qual será subtraído.
     * @param b O valor a ser subtraído.
     * @return O resultado da subtração (<code>a - b</code>).
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O resultado da multiplicação (<code>a * b</code>).
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     * <p>
     * É feito um tratamento de erro para garantir que o divisor não seja zero.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão.
     * @throws IllegalArgumentException Se o divisor (b) for zero, impedindo a divisão por <b>zero</b>.
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("ERRO: divisoa por ZERO (Operacao Invalida)");
        }
        return a / b;
    }

    /**
     * Método principal para executar uma das quatro operações fundamentais.
     * <p>
     * Utiliza a sintaxe de <b>switch expression (->)</b> do Java 14+.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @param op A string que representa a operação: <code>+</code>, <code>-</code>, <code>*</code>, ou <code>/</code>.
     * @return O resultado inteiro da operação.
     * @throws IllegalArgumentException Se a operação for inválida ou divisão por zero.
     * @see #dividir(int, int) 
     */
    public int calc(int a, int b, String op) {
        return switch (op) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("COMANDO INVALIDO - OPERACAO INVALIDA");
        };
    }
}