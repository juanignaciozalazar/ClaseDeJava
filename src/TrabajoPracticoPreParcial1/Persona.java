package src.TrabajoPracticoPreParcial1;

public abstract class Persona implements Informaciones {

    private String nombre;
    private long DNI;

    public Persona(String nombre, int DNI) {
        this.setNombre(nombre);
        this.setDNI(DNI);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
}
