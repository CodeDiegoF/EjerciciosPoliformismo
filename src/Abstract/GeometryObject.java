package Abstract;
import java.time.LocalDate;

public abstract class GeometryObject {
     private String color;
     private Boolean filled;
     private LocalDate dateCreated;
     
     public GeometryObject(String color, LocalDate dateCreated, Boolean filled) {
          this.color = color;
          this.dateCreated = dateCreated;
          this.filled = filled;
     }
     
     public String getColor() {
          return color;
     }
     public void setColor(String color) {
          this.color = color;
     }
     
     public LocalDate getDateCreated() {
          return dateCreated;
     }
     
     public void setDateCreated(LocalDate dateCreated) {
          this.dateCreated = dateCreated;
     }
     
     public Boolean getFilled() {
          return filled;
     }
     
     public void setFilled(Boolean filled) {
          this.filled = filled;
     }
     
     public abstract double getArea();
     public abstract double getPerimetro();
     
     
}
