package Ejercicio2Interfaz;

public class MainInterfaz2 {
    public static void main(String[] args) {
        Banco cuenta = Banco.crearCuentaCorriente(1000.00);
        System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());
        // Realizar algunas transacciones
        cuenta.realizarTransaccion(TipoTransaccion.INGRESO, 500.00);
        cuenta.realizarTransaccion(TipoTransaccion.RETIRADA, 200.00);
        cuenta.realizarTransaccion(TipoTransaccion.RETIRADA, 1500.00); // Esto lanzará una excepción
    }
}
