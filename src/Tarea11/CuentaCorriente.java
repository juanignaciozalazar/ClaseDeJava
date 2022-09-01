package src.Tarea11;

public class CuentaCorriente {
    // Atributos
    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    // Constructor
    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = (long) 1000000000000000.0 + (long) (Math.random() * 9000000000000000.0);
    }

    // Getters y setters
    public void setIngreso(double monto) {
        this.saldo += monto;
    }

    public void setReintegro(double monto) {
        if (monto > this.saldo) {
            System.out.println("ERROR: No posee el saldo para realizar un reintegro de " + monto);
        } else {
            this.saldo -= monto;
        }
    }

    public double getSaldo () {
        return this.saldo;
    }

    @Override
    public String toString() {
        return  "nombreTitular = '" + nombreTitular + '\'' +
                ", saldo = " + saldo +
                ", numeroCuenta = " + numeroCuenta;
    }

    // Métodos
    public void transferir(CuentaCorriente destino, double monto) {
        this.setReintegro(monto);
        destino.setIngreso(monto);
    }


}
