package CalculadoraInterfaz;

public class MainCalculadora {
     public static void main(String[] args) {
          
          double num1 = 10;
          double num2 = 5;
              
          Calculadora.sumar(num1, num2);
          Calculadora.restar(num1, num2);
          Calculadora.multiplicar(num1, num2);
          Calculadora.dividir(num1, num2);
     }
}
