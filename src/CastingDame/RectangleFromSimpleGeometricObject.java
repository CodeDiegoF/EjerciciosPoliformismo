package CastingDame;

import java.time.LocalDate;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
     private double width;
     private double height;
     
     public RectangleFromSimpleGeometricObject(String color, boolean filled, LocalDate dateCreated, double width, double height) {
          super(color, filled, dateCreated);
          this.width = width;
          this.height = height;
     }
     
     public double getWidth() {
          return width;
     }
     
     public void setWidth(double width) {
          this.width = width;
     }
     
     public double getHeight() {
          return height;
     }
     
     public void setHeight(double height) {
          this.height = height;
     }
     
     public double getArea() {
          return width * height;
     }
     
     public double getPerimeter() {
          return 2 * (width + height);
     }
     
     public String PrintRectangle() {
          return "Ancho: " + width + " || Altura: " + height + " || Area: " + getArea() + " || Perímetro: " + getPerimeter();
     }
}
