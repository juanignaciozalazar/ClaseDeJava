package src.clase1908;

import javax.swing.*;

public class ej02Condicionales {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        if (a > 100 ) {
            JOptionPane.showMessageDialog(null, "El numero es positivo y mayor a 100");
        } else if (a > 0 ) {
            JOptionPane.showMessageDialog(null,"El numero es positivo");
        } else if (a == 0) {
            JOptionPane.showMessageDialog(null, "El numero es 0");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }


    }



}
