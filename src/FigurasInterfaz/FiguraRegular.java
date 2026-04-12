package FigurasInterfaz;

public class FiguraRegular {
     TipoFigura tipoFigura;
     double longitudLado;
     
     public FiguraRegular(Double longitudLado, TipoFigura tipoFigura) {
          this.longitudLado = longitudLado;
          this.tipoFigura = tipoFigura;
     }
     
     public TipoFigura getTipoFigura() {
          return tipoFigura;
     }
     
     public void setTipoFigura(TipoFigura tipoFigura) {
          this.tipoFigura = tipoFigura;
     }
     
     public Double getLongitudLado() {
          return longitudLado;
     }
     
     public void setLongitudLado(Double longitudLado) {
          this.longitudLado = longitudLado;
     }
     
     double calcularPerimetro() {
          switch (tipoFigura) {
               case TRIANGULO_EQUILATERO:
                    return 3 * longitudLado;
               case CUADRADO:
                    return 4 * longitudLado;
               case HEXAGONO:
                    return 6 * longitudLado;
               case CIRCULO:
                    return 2 * Math.PI * longitudLado;
               default:
                    return 0.0;
          }
     }
     
     double calcularArea() {
          switch (tipoFigura) {
               case TRIANGULO_EQUILATERO:
                    return (Math.sqrt(3) / 4) * Math.pow(longitudLado, 2);
               case CUADRADO:
                    return  longitudLado * longitudLado;
               case CIRCULO:
                    return Math.PI * Math.pow(longitudLado, 2);
               case HEXAGONO:
                    return ((3 * Math.sqrt(3)) / 2) * Math.pow(longitudLado, 2);
               default:
                    return 0.0;
          }
     }
     
     @Override
     public String toString() {
          return String.format(
                  "Figura: { %s%nPerímetro: %.2f%nÁrea: %.2f }",
                  tipoFigura,
                  calcularPerimetro(),
                  calcularArea()
          );
     }
}
