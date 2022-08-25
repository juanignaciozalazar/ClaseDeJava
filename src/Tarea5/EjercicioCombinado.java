package src.Tarea5;

import javax.swing.*;

public class EjercicioCombinado {
    private static final String ejercicio = "(((6/5) - ((2/3) * (7/2)) + (2/30)) / ((1/3) / 5))";
    //private static double resultado = Math.round((((6.0/5.0) - ((2.0/3.0) * (7.0/2.0)) + (2.0/30.0)) / ((1.0/3.0) / 5.0)));

    private static final double resultado = Math.round((((6.0/5) - ((2.0/3) * (7.0/2)) + (2.0/30)) / ((1.0/3) / 5.0)));

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "El resultado de: " +
                        EjercicioCombinado.ejercicio +
                        " es " +
                        EjercicioCombinado.resultado);

    }
}
