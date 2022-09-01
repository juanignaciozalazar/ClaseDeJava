package src.Tarea9;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double pesoIdeal;
        int altura;
        char genero;

        System.out.println("Introduzca su altura en cm");
        altura = (int) s.nextDouble();
        s.nextLine();
        System.out.println("Introduzca su genero (H/M)");
        genero = s.nextLine().toUpperCase().charAt(0);


        switch (genero) {
            case 'H':
                pesoIdeal = altura - 110;
                break;
            case 'M':
                pesoIdeal = altura - 120;
                break;
            default:
                pesoIdeal = -120;
                break;
        }
        System.out.println("Su peso ideal es: " + formatDouble(pesoIdeal));
    }
    public static String formatDouble(double x) {
        return (x == (long) x) ? String.format("%d", (long) x) : String.format("%s", x);
    }

}