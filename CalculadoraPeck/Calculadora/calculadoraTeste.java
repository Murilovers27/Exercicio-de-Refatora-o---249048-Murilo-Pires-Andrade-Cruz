package Calculadora;

/**
 * Classe de teste para validar o funcionamento da classe Calculadora.
 * <p>
 * Este teste utiliza <b>blocos try-catch</b> para garantir que a captura das exceções lançadas
 * pelo código refatorado funcione corretamente, garantindo a robustez da aplicação.
 * * @author Murilo Pires Andrade Cruz
 * @version 1.0
 * @since 1.0
 */
public class calculadoraTeste {
    /**
     * Método principal que executa a bateria de testes.
     * <p>
     * Os testes incluem <i>operações válidas</i> e testes de <i>divisão por zero</i> e <i>operação nula</i>.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("TESTE 1: " + calc.calc(5, 3, "+"));
        System.out.println("TESTE 2: " + calc.calc(10, 4, "-"));
        System.out.println("TESTE 3: " + calc.calc(7, 2, "*"));
        System.out.println("TESTE 4: " + calc.calc(20, 5, "/"));
        
        System.out.println();
        
        try {
            System.out.println(calc.calc(8, 0, "/"));
        
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println(calc.calc(5, 5, null));
    
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}