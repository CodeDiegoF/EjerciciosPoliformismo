package Polimorfismo2;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MainPolimorfismo2 {
     public static void main(String[] args) {
          FiguraRegular c1 = new Cuadrado(4, 3.3);
          FiguraRegular c2 = new Cuadrado(4, 2.6);
          FiguraRegular t1 = new TrianguloEquilatero(3, 4);
          FiguraRegular t2 = new TrianguloEquilatero(3, 3.5);

          List<FiguraRegular> figuraRegulares = List.of(c1, c2, t1, t2);
          for (FiguraRegular figura : figuraRegulares) {
               System.out.println(figura);
          }
          
          System.out.println("Area Total: " + calcularAreaTotal(figuraRegulares));
     }
     
     public static double calcularAreaTotal(List<FiguraRegular> figuraRegulares) {
          return figuraRegulares.stream()
                  .filter(Objects::nonNull)
                  .mapToDouble(FiguraRegular::calcularArea)
                  .sum();
          
     }
}
