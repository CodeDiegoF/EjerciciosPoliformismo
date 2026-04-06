package Ejercicio1Interfaz;

public class ArrayReales implements Estadisticas {
    private double[] valores;

    public ArrayReales(double[] valores) {
        this.valores = valores;
    }
    
    public double[] getValores() {
        return valores;
    }

    @Override
    public int obtenerNumeroValores() {
        return valores.length;
    }

    @Override
    public double obtenerValorMinimo() {
        double min = Double.MAX_VALUE;
        for (double valor : valores) {
            if (valor < min) {
                min = valor;
            }
        }
        return min;
    }

    @Override
    public double obtenerValorMaximo() {
        double max = Double.MIN_VALUE;
        for (double valor : valores) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    }

    @Override
    public double calcularSuma() {
        double suma = 0;
        for (double valor : valores) {
            suma += valor;
        }
        return suma;
    }

    @Override
    public double calcularValorMedio() {
        return calcularSuma() / obtenerNumeroValores();
    }

    @Override
    public double calcularDesviacionTipica() {
        double media = calcularValorMedio();
        double sumaCuadrados = 0;
        for (double valor : valores) {
            sumaCuadrados += Math.pow(valor - media, 2);
        }
        return Math.sqrt(sumaCuadrados / obtenerNumeroValores());
    }
}
