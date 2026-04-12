package FigurasInterfaz;

public class Cuadrado implements Figura {
     private double longitudLado;
     
     public Cuadrado(double longitudLado) {
          this.longitudLado = longitudLado;
     }
     
     public double getLongitudLado() {
          return longitudLado;
     }
     
     public void setLongitudLado(double longitudLado) {
          this.longitudLado = longitudLado;
     }
     
     @Override
     public double calcularArea() {
          return longitudLado * longitudLado;
     }
     
     @Override
     public double calcularPerimetro() {
          return 4 * longitudLado;
     }
     
     @Override
     public String toString() {
          return "Cuadrado{ " +
                  " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro() + " }";
     }
}
