package Abstract;

import java.time.LocalDate;

public class Rectangulo extends GeometryObject {

	 private Double ancho;
	 private Double alto;

	 public Rectangulo(String color, LocalDate dateCreated, Boolean filled, Double ancho, Double alto) {
		  super(color, dateCreated, filled);
		  this.ancho = ancho;
		  this.alto = alto;
	 }

	 public Double getAncho() {
		  return ancho;
	 }

	 public void setAncho(Double ancho) {
		  this.ancho = ancho;
	 }

	 public Double getAlto() {
		  return alto;
	 }

	 public void setAlto(Double alto) {
		  this.alto = alto;
	 }

	 public double calcularArea() {
		  return ancho * alto;
	 }

	 public double calcularPerimetro() {
		  return 2 * (ancho + alto);
	 }

	 @Override
	 public double getArea() {
		  return calcularArea();
	 }

	 @Override
	 public double getPerimetro() {
		  return calcularPerimetro();
	 }

}

