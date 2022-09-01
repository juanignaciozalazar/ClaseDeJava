package src.Tarea10;

import java.util.Scanner;

public class JuegoAdivinarNumero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        do {
            partida(s);
        } while (preguntarRepetir(s));
    }

    public static void partida(Scanner s) {
        int numeroUsuario;
        int numeroRandom = (int) (Math.random() * 99) + 1;

        do {
            System.out.println("Ingrese un número de 1 a 100");
            numeroUsuario = (int) s.nextDouble();
            s.nextLine();
            if (numeroUsuario < numeroRandom) {
                System.out.println("El número ingresado es menor que el número aleatorio");
            } else if (numeroUsuario > numeroRandom) {
                System.out.println("El número ingresado es mayor que el número aleatorio");
            } else System.out.println("Felicitaciones!!! Adivinaste el número!");

        } while (numeroUsuario != numeroRandom);
    }

    public static boolean preguntarRepetir(Scanner s) {
        char decision;
        do {
            System.out.println("¿Desea jugar de nuevo? S/N");
            decision = s.nextLine().toUpperCase().charAt(0);
            if (decision == 'S' || decision == 'N') {
                System.out.println("---------------------------------------------------------");
                break;
            } else {
                System.out.println("Ingrese 'S' para seguir jugando, o 'N' para parar");
            }
        } while (true);

        return (decision == 'S');
    }

}


