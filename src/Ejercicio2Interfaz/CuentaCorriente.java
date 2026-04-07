package Ejercicio2Interfaz;

public class CuentaCorriente implements Banco {
    private double saldo_inicial;

    public CuentaCorriente(double saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public double getSaldo_inicial() {
        return saldo_inicial;
    }


    @Override
    public double obtenerSaldo() {
        return saldo_inicial;
    }

    @Override
    public void ingresarDinero(double valor) {
        saldo_inicial += valor;
    }

    @Override
    public void retirarDinero(double valor) {
        saldo_inicial -= valor;
    }

    @Override
    public void realizarTransaccion(TipoTransaccion tipo, double valor) {
        Banco.super.realizarTransaccion(tipo, valor);
    }
}
