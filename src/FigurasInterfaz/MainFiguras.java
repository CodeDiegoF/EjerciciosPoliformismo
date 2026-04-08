package FigurasInterfaz;

import java.util.ArrayList;
import java.util.List;

public class MainFiguras {
     public static void main(String[] args) {
          List<FiguraRegular> figuras = new ArrayList<FiguraRegular>();
          FiguraRegular triangulo = new FiguraRegular(5.0, TipoFigura.TRIANGULO_EQUILATERO);
          figuras.add(triangulo);
          FiguraRegular cuadrado = new FiguraRegular(4.0, TipoFigura.CUADRADO);
          figuras.add(cuadrado);
          FiguraRegular circulo = new FiguraRegular(3.0, TipoFigura.CIRCULO);
          figuras.add(circulo);
          
          System.out.printf("%-25s %-25s %-25s\n", "Figura", "Perimetro", "Area");
          for (FiguraRegular figura : figuras) {
               System.out.printf("%-25s %-25.2f %-25.2f\n", figura.getTipoFigura(), figura.calcularPerimetro(), figura.calcularArea());
          }
     }
}
