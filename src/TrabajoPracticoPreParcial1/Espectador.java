package src.TrabajoPracticoPreParcial1;

public class Espectador extends Persona implements Informaciones {

    private char fila;
    private int silla;

    public Espectador(String nombre, int DNI, char fila, int silla) {
        super(nombre, DNI);
        this.fila = fila;
        this.silla = silla;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(char silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + getNombre() + "'" +
                "DNI=" + getDNI() +
                "fila=" + fila +
                ", silla=" + silla +
                '}';
    }

    @Override
    public String getName() {
        return null;
    }
}
