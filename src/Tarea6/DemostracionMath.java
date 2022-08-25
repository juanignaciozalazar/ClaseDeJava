package src.Tarea6;

import java.util.Scanner;

public class DemostracionMath {

    public static Scanner s = new Scanner(System.in);

    public static int bucle() {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1: Funciones trigonométricas habituales");
        System.out.println("2: Funciones exponencial y su inversa");
        System.out.println("3: Calcular area y perimetro de circulo");
        System.out.println("0: Terminar");
        return s.nextInt();
    }

    //Funciones Trigonométricas Habituales
    public static void trigHabitual () {
        System.out.println("Ingrese una variable x: ");
        double x = s.nextDouble();
        System.out.println("Ingrese una variable y: ");
        double y = s.nextDouble();
        System.out.println("----------------------------------------------");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Sen = " + Math.sin(x/y));
        System.out.println("Coseno = " + Math.cos(x/y));
        System.out.println("Tangente = " + Math.tan(x/y));
        System.out.println("Arcotangente = " + Math.atan(x/y));
        System.out.println("Arcotangente (atan2) = " + Math.atan2(x,y));
        System.out.println("----------------------------------------------");
    }

    public static void exponencial () {
        System.out.println("Ingrese una variable x: ");
        double x = s.nextDouble();
        System.out.println("----------------------------------------------");
        System.out.println("Se usa e=" + Math.E);
        System.out.println("Exponencial = " + Math.exp(x));
        System.out.println("Logaritmo (base e) = " + Math.log(x));
        System.out.println("----------------------------------------------");
    }

    public static void circulo () {
        System.out.println("Ingrese el radio del circulo: ");
        double radio = s.nextDouble();
        System.out.println("----------------------------------------------");
        System.out.println("Area = " + (radio * radio * Math.PI) + " u.m.");
        System.out.println("Perímetro = " + (radio * 2 * Math.PI) + " u.m.");
        System.out.println("----------------------------------------------");
    }


    public static void main(String[] args) {

        boolean decision = true;

        do {
            switch (bucle()) {
                case 1 -> trigHabitual();
                case 2 -> exponencial();
                case 3 -> circulo();
                case 0 -> decision = false;
                default -> System.out.println("\n INGRESO UN VALOR FUERA DE RANGO \n");
            }

        } while (decision);

    }
}
