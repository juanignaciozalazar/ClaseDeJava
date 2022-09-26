package src.clase0809;

public class Main {
    public static void main(String [] args )  {
        Fraccion f1 = new Fraccion(126, 5);
        Fraccion f2 = new Fraccion(25, 1);

        if (f1.esMayorQue(f2)) {
            System.out.println(f1 + " > " + f2);
        } else {
            System.out.println(f1 + " <= " + f2);
        }
    }
}
