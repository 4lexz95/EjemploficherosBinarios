package ficherosbinarios;

import java.io.*;

public class ficherosbina {
    public static void main(String[] args) {
        File file = new File("binarios.dat");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < 1000; i++) {
                dos.writeInt(i);

            }
            dos.writeInt(200);
            dos.writeBoolean(false);
            dos.writeChars("Hola mundo");
            dos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
