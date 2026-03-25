package Polimorfismo2;

public abstract class FiguraRegular {
     private int numeroLados;
     private double longitudLado;
     
     public FiguraRegular(int numeroLados, double longitudLado) {
          this.numeroLados = numeroLados;
          this.longitudLado = longitudLado;
     }
     
     public int getNumeroLados() {
          return numeroLados;
     }
     
     public void setNumeroLados(int numeroLados) {
          this.numeroLados = numeroLados;
     }
     
     public double getLongitudLado() {
          return longitudLado;
     }
     
     public void setLongitudLado(double longitudLado) {
          this.longitudLado = longitudLado;
     }
     
     public abstract double calcularPerímetro();
     
     public abstract double calcularArea();
     
     @Override
     public String toString() {
          return "Lados: " + numeroLados +
                  ", longitud Lado: " + longitudLado;
     }
}