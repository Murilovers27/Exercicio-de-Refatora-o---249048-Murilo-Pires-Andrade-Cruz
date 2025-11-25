package Calculadora;

public class calculadoraTeste {
    public static void main(String[] args) {
    
        calculadora calc = new calculadora();

        calc.calc(5, 3, "+"); 
    
        calc.calc(10, 4, "-"); 
        
        calc.calc(7, 2, "*"); 
        
        calc.calc(20, 5, "/"); 
        
        calc.calc(10, 0, "/"); 
        
        calc.calc(5, 5, "#"); 
    }
}