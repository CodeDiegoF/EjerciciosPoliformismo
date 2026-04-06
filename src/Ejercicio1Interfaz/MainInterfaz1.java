package Ejercicio1Interfaz;

import java.util.Random;

public class MainInterfaz1 {
     public static void main(String[] args) {
          
          double[] numbers = new Random().doubles(0,350).limit(10).toArray();
          System.out.println("Números generados:");
          for (double number : numbers) {
               System.out.printf("%.2f%n", number);
          }
          
          ArrayReales arrayReales = new ArrayReales(numbers);

          System.out.println(arrayReales.imprimirResultados());
     }
}
