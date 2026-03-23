package Polimorfismo1;

public class Cuadrado extends  FiguraRegular{
     
     public Cuadrado(int numeroLados, double longitudLado) {
          super(numeroLados, longitudLado);
     }
     
     @Override
     public double calcularPerímetro() {
          return getLongitudLado() * 4;
     }
     
     
     public double calcularArea(){
          return Math.pow(getLongitudLado(), 2);
     }
     
     @Override
     public String toString() {
          return "Cuadrado: " +
                  "Area: " + calcularArea() + " || Perímetro: " + calcularPerímetro();
     }
}