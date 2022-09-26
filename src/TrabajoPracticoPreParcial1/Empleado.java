package src.TrabajoPracticoPreParcial1;

public class Empleado extends Persona implements Informaciones{
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, int DNI) {
        super(nombre, DNI);
    }

    @Override
    public String getName() {
        return null;
    }
}
