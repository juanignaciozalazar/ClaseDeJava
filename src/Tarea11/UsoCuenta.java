package src.Tarea11;

public class UsoCuenta {
    public static void main(String [] args) {
        CuentaCorriente Cuenta1 = new CuentaCorriente("Juan", 30000);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Pedro", 10000);

        Cuenta1.transferir(Cuenta2, 2500);

        System.out.println(Cuenta1);
        System.out.println(Cuenta2);
    }
}
