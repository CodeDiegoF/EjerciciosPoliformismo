package Ejercicio2Interfaz;

public interface Banco {
    double obtenerSaldo();
    void ingresarDinero(double valor);
    void retirarDinero(double valor);

    private boolean comprobarRetiro(double valor) {
        if (valor > obtenerSaldo()) {
            throw new IllegalArgumentException("No se puede retirar más dinero del que hay en la cuenta.");
        }else
            return true;
    }

    private String MostrarInformacionTransaccion(TipoTransaccion tipo, double valor) {
        return String.format("Transacción: %s, Valor: %.2f, Saldo actual: %.2f",
                tipo, valor, obtenerSaldo());
    }

    default void realizarTransaccion(TipoTransaccion tipo, double valor) {
        switch (tipo) {
            case INGRESO:
                ingresarDinero(valor);
                System.out.println(MostrarInformacionTransaccion(tipo, valor));
                break;
            case RETIRADA:
                if (comprobarRetiro(valor)){
                    retirarDinero(valor);
                }
                System.out.println(MostrarInformacionTransaccion(tipo, valor));
                break;
            default:
                throw new IllegalArgumentException("Tipo de transacción no reconocido.");
        }
    }

    static Banco crearCuentaCorriente(double saldoInicial) {
        return new CuentaCorriente(saldoInicial);
    }

    
}
