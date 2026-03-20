package Abstract;

import java.time.LocalDate;

public class MainAbstract {
     public static void main(String[] args) {
          Circulo circulo = new Circulo ("blue", LocalDate.now(), true, 5.0);
          Rectangulo rectangulo = new Rectangulo("green", LocalDate.now(), false, 4.0, 6.0);

          circulo.imprimirCirculo();
          System.out.println("Circulo: ");
          muestraFiguraGeometrica(circulo);
          System.out.println("--------------------------");
          System.out.println("Rectangulo: ");
          muestraFiguraGeometrica(rectangulo);
          System.out.println("--------------------------");
          System.out.println("equalArea: " + equalArea(circulo, rectangulo));
     }

     public static Boolean equalArea(GeometryObject figura1, GeometryObject figura2) {
          return Math.abs(figura1.getArea() - figura2.getArea()) < 0.0001; // Consideramos iguales si la diferencia es menor a un umbral
     }

     public static void muestraFiguraGeometrica(GeometryObject figura) {
          System.out.println("Area: " + figura.getArea());
          System.out.println("Perimetro: " + figura.getPerimetro());
     }
}
