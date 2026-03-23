package CastingDemo;

import java.time.LocalDate;

public class MainCasting {
     public static void main(String[] args) {
      SimpleGeometricObject objeto1 = new SimpleGeometricObject("Rojo", true, LocalDate.now());
      DisplayObject(objeto1);
      CircleFromSimpleGeometricObject objeto2 = new CircleFromSimpleGeometricObject("Azul", false, LocalDate.now(), 5);
      DisplayObject(objeto2);
      RectangleFromSimpleGeometricObject objeto3 = new RectangleFromSimpleGeometricObject("Verde", true, LocalDate.now(), 4, 6);
      DisplayObject(objeto3);
     }
     
     public static void DisplayObject(SimpleGeometricObject objeto) {
            if (objeto instanceof CircleFromSimpleGeometricObject) {
                 CircleFromSimpleGeometricObject circulo = (CircleFromSimpleGeometricObject) objeto;
                 System.out.println(circulo.PrintCircle());
            }
            else if (objeto instanceof RectangleFromSimpleGeometricObject) {
                 RectangleFromSimpleGeometricObject rectangulo = (RectangleFromSimpleGeometricObject) objeto;
                 System.out.println(rectangulo.PrintRectangle());
            }
            else {
                 System.out.println("El objeto no es ni un círculo ni un rectángulo.");
            }
     }
}
