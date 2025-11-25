package Calculadora;

public class calculadora {

    int r;
    
    
    public int calc(int a, int b, String op) {
    
        switch (op) {
            case "+": 
                r = a + b;
                break;
            case "-": 
                r = a - b;
                break;
            case "*":
                r = a * b;
                break;
            case "/":
                
                if (b == 0) {
                    System.out.println("Erro: Divisao por zero (Operacao Invalida)");
                    r = 0;
                    break;
                }
                r = a / b;
                break;
            default:
                System.out.println("Erro: Operacao Invalida");
                r = 0;
                break;
        }
        
    
        return r;
    }
}