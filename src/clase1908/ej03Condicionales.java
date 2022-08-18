package src.clase1908;

import javax.swing.*;

public class ej03Condicionales {

    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
        if (edad < 17 || edad > 80) {
            JOptionPane.showMessageDialog(null, "Usted no tiene edad para manejar");
        } else {
            String s = JOptionPane.showInputDialog("Tiene carnet?");
            if (s.equalsIgnoreCase("si")) {
                JOptionPane.showMessageDialog(null, "Usted puede manejar");
            } else {
                JOptionPane.showMessageDialog(null, "Usted no puede manejar");
            }
        }
    }
}
