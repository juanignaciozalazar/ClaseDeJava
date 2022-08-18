package src.clase1908;

import javax.swing.*;

public class ej01OptionPane {
    public static void main(String[] args) {

        // Ejecuta la suma de 2 enteros de entrada
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero b"));
        int c = a * b * b;
        JOptionPane.showMessageDialog(null, "La suma es: " + c);
    }
}
