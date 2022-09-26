package src.TrabajoPracticoPreParcial1;

import java.util.ArrayList;

public class Sala implements Informaciones {
    //Atributos
    private int capacidad;
    private String pelicula;
    private String nombre;
    private ArrayList<Espectador> espectadores;

    //Constructores

    public Sala(int capacidad, String pelicula, String nombre, ArrayList<Espectador> espectadores) {
        this.capacidad = capacidad;
        this.pelicula = pelicula;
        this.nombre = nombre;
        setEspectadores(espectadores);

    }

    public Sala(){

    }

    // Getters y Setters

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Espectador> getEspectadores() {
        if (this.espectadores == null) {
            System.out.println("SIN ESPECTADORES CARGADOS");
        }
        return this.espectadores;

    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        if (espectadores.size() <= this.capacidad) {
            this.espectadores = espectadores;
        } else {
            throw new RuntimeException("ERROR: CAPACIDAD DE ESPECTADORES SUPERADA");
        }
    }

    // Metodos


    @Override
    public String toString() {
        return "Sala{" +
                "capacidad=" + capacidad +
                ", cantidad de espectadores=" + espectadores +
                ", nombre='" + nombre + '\'' +
                ", pelicula='" + pelicula + '\'' +
                '}';
    }

    public String getName() {
        return this.nombre;
    }
}
