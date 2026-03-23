package Polimorfismo1;

import java.util.*;

public class MainPolimorfismo1 {
     public static void main(String[] args) {
          List<FiguraRegular> figuraRegulares = getFiguraRegulars();
          
          Optional<FiguraRegular> mayorPerimetro = getfRegMayorPerimetro(figuraRegulares);
          
          if (mayorPerimetro.isPresent()) {
               System.out.println("Figura con mayor perímetro -> " + mayorPerimetro.get());
          } else {
               System.out.println("No hay figuras en la lista");
          }
          
          mostrarAreasFiguras(figuraRegulares);
          
          mostrarFiguras(figuraRegulares);
          
     }
     
     private static List<FiguraRegular> getFiguraRegulars() {
          List<FiguraRegular> figuraRegulares = new ArrayList<>();
          
          FiguraRegular cuadrado1 = new Cuadrado(4, 3.3);
          FiguraRegular cuadrado2 = new Cuadrado(4, 2.6);
          FiguraRegular triangulo1 = new TrianguloEquilatero(3, 4);
          FiguraRegular triangulo2 = new TrianguloEquilatero(3, 3.5);
          
          figuraRegulares.add(cuadrado1);
          figuraRegulares.add(cuadrado2);
          figuraRegulares.add(triangulo1);
          figuraRegulares.add(triangulo2);
          return figuraRegulares;
     }
     
     public static void mostrarAreasFiguras(List<FiguraRegular> figuraRegulares) {
          for (FiguraRegular figura : figuraRegulares) {
               if (figura instanceof Cuadrado) {
                    Cuadrado cuadrado = (Cuadrado) figura;
                    System.out.println("Area Cuadrado -> " + cuadrado.calcularArea() + " cm^2");
               }else if (figura instanceof TrianguloEquilatero) {
                    TrianguloEquilatero triangulo = (TrianguloEquilatero) figura;
                    System.out.println("Area Triángulo Equilátero -> " + triangulo.calcularArea() + " cm^2");
               }
          }
     }
     public static Optional<FiguraRegular> getfRegMayorPerimetro(List<FiguraRegular> figuras){
          if (figuras == null || figuras.isEmpty()) {
               return Optional.empty();
          }
          return figuras.stream()
                  .filter(Objects::nonNull)
                  .sorted(Comparator.comparingDouble(FiguraRegular::calcularPerímetro).reversed())
                  .findFirst();
     }
     
     public static void mostrarFiguras(List<FiguraRegular> figuras) {
          for (FiguraRegular figura : figuras) {
               if (figura instanceof Cuadrado) {
                    System.out.println("Cuadrado -> " + figura.toString());
               }else if (figura instanceof TrianguloEquilatero) {
                    System.out.println("Triángulo Equilátero -> " + figura.toString());
               }
          }
     }
}
