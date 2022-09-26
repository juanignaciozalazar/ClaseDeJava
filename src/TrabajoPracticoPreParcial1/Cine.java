package src.TrabajoPracticoPreParcial1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine implements Informaciones {

    private static final int MAXSILLAS = 9;
    private static final char MAXFILAS = 'Z';


    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        Sala miSala = crearSala();
        System.out.println(miSala);
    }

    public static Sala crearSala() {
        Scanner s = new Scanner(System.in);
        boolean decision = true;
        ArrayList<Espectador> espectadores = new ArrayList<>();
        char fila = 'A';
        int silla = 1;

        System.out.println("¿Cual es la capacidad de la sala?");
        int capacidad = leer();
        System.out.println("¿Cual es el nombre de la sala?");
        String nombreSala = s.nextLine();
        System.out.println("¿Que pelicula se va a proyectar?");
        String pelicula = s.nextLine();

        do {

            System.out.println("----------------------");
            System.out.println("Carga de espectadores");
            System.out.println("----------------------");

            //Obtencion de datos para espectador
            System.out.println("Ingrese su nombre: ");
            String nombre = s.nextLine();
            System.out.println("Ingrese su DNI");
            int DNI = leer();

            //Creacion del espectador y adicion a la lista de los mismos
            Espectador miEspectador = new Espectador(nombre, DNI, fila, silla);
            espectadores.add(miEspectador);

            //Preparar para siguiente espectador
            if (silla + 1 > MAXSILLAS) {
                fila++;
                silla = 1;
            } else {
                silla++;
            }

            //Preguntar si desea finalizar
            System.out.println("Desea cargar otro espectador? S/N");
            String d = s.nextLine();
            decision = (d.toUpperCase().charAt(0) == 'S');



        } while (decision == true);


        return new Sala(capacidad, pelicula, nombreSala, espectadores);
    }

    public static int leer() {
        Scanner s = new Scanner(System.in);
        try {
            int x = s.nextInt();
            return x;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("ERROR EN EL INGRESO DE DATOS");
        }
    }

    @Override
    public String getName() {
        return null;
    }
}
