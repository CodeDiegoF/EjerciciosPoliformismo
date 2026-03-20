package CastingDame;

import java.time.LocalDate;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
     private double radius;
     
     public CircleFromSimpleGeometricObject(String color, boolean filled, LocalDate dateCreated, double radius) {
          super(color, filled, dateCreated);
          this.radius = radius;
     }
     
     public double getRadius() {
          return radius;
     }
     
     public void setRadius(double radius) {
          this.radius = radius;
     }
     
     public double getArea() {
          return radius * radius * Math.PI;
     }
     
     public double getDiameter() {
            return 2 * radius;
     }
     
     public double getPerimeter() {
          return 2 * radius * Math.PI;
     }
     
     public String PrintCircle() {
          return "radio: " + radius + " || Area: " + getArea() + " || Diámetro:  " + getDiameter() + " || Perímetro: " + getPerimeter();
     }
}
