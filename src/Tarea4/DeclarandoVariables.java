package src.Tarea4;

import javax.swing.*;

public class DeclarandoVariables {
    String nombre = "Juan Ignacio Zalazar";
    int Edad = 20;
    double salario = 123456.89;
    boolean carnet = true;

    @Override
    public String toString() {
        String tieneCarnet = carnet ? "" : "no ";

        return "Mi nombre es " + nombre +
                ", tengo " + Edad + " años" +
                ", desearia ganar " + salario + " pesos al mes" +
                ", y " + tieneCarnet + "tengo carnet.";
    }

    public static void main(String[] args) {
        DeclarandoVariables d = new DeclarandoVariables();
        JOptionPane.showMessageDialog(null, d);
        System.out.println(d);
    }
}
