package src.Tarea8;

import java.util.Scanner;

public class RaizScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("introduce un número:");
        double x = s.nextDouble();
        System.out.println("la raíz de " + formatDouble(x) + " es = " + Math.sqrt(x) );

    }

    public static String formatDouble(double x) {
        return (x == (long) x) ? String.format("%d", (long) x) : String.format("%s", x);
    }

}
