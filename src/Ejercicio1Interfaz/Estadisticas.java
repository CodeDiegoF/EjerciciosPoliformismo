package Ejercicio1Interfaz;

public interface Estadisticas {
     int obtenerNumeroValores(); //número de elementos de una colección
     double obtenerValorMinimo(); //valor mínimo de una colección
     double obtenerValorMaximo(); //valor máximo de una colección
     double calcularSuma(); //suma de los valores de una colección
     double calcularValorMedio(); //valor medio de una colección
     double calcularDesviacionTipica(); //desviación típica de una colección.
     
     //metodo para imprimir los resultados de las estadísticas
     default String imprimirResultados() {
     return String.format("Número de valores: %d%nValor mínimo: %.2f%nValor máximo: %.2f%nSuma: %.2f%nValor medio: %.2f%nDesviación típica: %.2f",
          obtenerNumeroValores(),
          obtenerValorMinimo(),
          obtenerValorMaximo(),
          calcularSuma(),
          calcularValorMedio(),
          calcularDesviacionTipica());
     }
}
