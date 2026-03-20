package Abstract;

import java.time.LocalDate;

public class  Circulo extends GeometryObject {
     private Double radio;
     
     public Circulo(String color, LocalDate dateCreated, Boolean filled, Double radio) {
          super(color, dateCreated, filled);
          this.radio = radio;
     }
     
     public Double getRadio() {
          return radio;
     }
     
     public void setRadio(Double radio) {
          this.radio = radio;
     }
     
     public double calcularArea() {
          return Math.PI * radio * radio;
     }
     
     public double calcularPerimetro() {
          return 2 * Math.PI * radio;
     }
     
     public double calcularDiametro() {
          return 2 * radio;
     }
     
     public void imprimirCirculo() {
          System.out.println("Circle{radio=" + radio + ", area=" + calcularArea() + ", perimetro=" + calcularPerimetro() + "}");
     }
     
     @Override
     public double getArea() {
          return calcularArea();
     }
     
     @Override
     public double getPerimetro() {
          return calcularPerimetro();
     }
}
