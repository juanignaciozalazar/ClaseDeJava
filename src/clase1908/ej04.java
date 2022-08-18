package src.clase1908;

import javax.swing.*;

public class ej04 {

    public static void main(String[] args) {
        String[] cadena = new String[100];
        int num = 0;
        int i = 0;
        do {
            cadena[i] = JOptionPane.showInputDialog("Ingrese un numero o 'f' para finalizar");
            if (!cadena[i].equals("f")) {
                num += Integer.parseInt(cadena[i]);
            } else break;
            i++;
        } while (true);

        JOptionPane.showMessageDialog(null,"La suma de todos los numeros es: " + num);

    }
}
