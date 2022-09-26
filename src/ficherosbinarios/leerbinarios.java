package ficherosbinarios;

import java.io.*;

public class leerbinarios {
    public static void main(String[] args) {
        File file = new File("binarios.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            while (true) {
                int numero = dis.readInt();
                System.out.printf("El numero es: %d %m", numero);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (EOFException eofException){
            System.out.println("Fichero terminado");

        } catch (IOException e) {
                throw new RuntimeException(e);
        }

    }
}
