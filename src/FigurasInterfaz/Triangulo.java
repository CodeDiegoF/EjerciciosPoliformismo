package FigurasInterfaz;

public class Triangulo implements Figura {
     private double longitudLado;
     
     public Triangulo(double longitudLado) {
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
          return (Math.sqrt(3) / 4) * Math.pow(longitudLado, 2);
     }
     
     @Override
     public double calcularPerimetro() {
          return 3 * longitudLado;
     }
     
     @Override
     public String toString() {
          return "Triangulo{ " +
                  " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro() + " }";
     }
}
