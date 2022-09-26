package src.clase1509;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Excepcion {
    public static void main(String[] args) {
       try {
           BufferedImage imagen = ImageIO.read(new File("/assets/images/introgit1.png"));
           System.out.println("la imagen existe");
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("No se encuentra el archivo");
       }
    }

}
