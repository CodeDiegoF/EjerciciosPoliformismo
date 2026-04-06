package CalculadoraInterfaz;

public interface Calculadora {
     
     static void sumar(double a, double b) {
            double resultado = a + b;
            System.out.println("El resultado de la suma es: " + resultado);
     }
     
     static void restar(double a, double b) {
          double resultado = a - b;
          System.out.println("El resultado de la resta es: " + resultado);
     }
     
     static void multiplicar(double a, double b) {
          double resultado = a * b;
          System.out.println("El resultado de la multiplicacion es: " + resultado);
     }
     
     static void dividir(double a, double b) {
          double resultado = a/b;
          System.out.println("El resultado de la division es: " + resultado);
     }
}
