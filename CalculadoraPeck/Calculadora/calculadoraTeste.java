package Calculadora;

public class calculadoraTeste {
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