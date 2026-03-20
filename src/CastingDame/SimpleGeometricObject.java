package CastingDame;

import java.time.LocalDate;

public class SimpleGeometricObject {
     private String color = "white";
     private boolean filled;
     private LocalDate dateCreated;
     
     public SimpleGeometricObject(String color, boolean filled, LocalDate dateCreated) {
          this.color = color;
          this.filled = filled;
          this.dateCreated = dateCreated;
     }
     
     public String getColor() {
          return color;
     }
     
     public void setColor(String color) {
          this.color = color;
     }
     
     public boolean isFilled() {
          return filled;
     }
     
     public void setFilled(boolean filled) {
          this.filled = filled;
     }
     
     public LocalDate getDateCreated() {
          return dateCreated;
     }
     
     public void setDateCreated(LocalDate dateCreated) {
          this.dateCreated = dateCreated;
     }
     
     @Override
     public String toString() {
          return color +
                  " || " + filled +
                  " || " + dateCreated +
                  " || ";
     }
}
