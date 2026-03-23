package Polimorfismo1;

public class TrianguloEquilatero extends FiguraRegular {
     
     public TrianguloEquilatero(int numeroLados, double longitudLado) {
          super(numeroLados, longitudLado);
     }
     
     @Override
     public double calcularPerímetro() {
          return getLongitudLado() * 3;
     }
     
     public double calcularArea(){
          return (Math.sqrt(3) / 4) * Math.pow(getLongitudLado(), 2);
     }
     
     public String toString() {
          return "Triángulo: " +
                  "Area: " + calcularArea() + " || Perímetro: " + calcularPerímetro();
     }
}
