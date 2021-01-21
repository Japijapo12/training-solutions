package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {

   public void decode(Path path) {

       try (InputStream is = Files.newInputStream(path)) {
           //byte[] bytes = Files.readAllBytes(path);
           byte[] buffer = new byte[10];
            int size;
           while ((size = is.read(buffer)) > 0) {
               //System.out.println(size);
               for (int i = 0; i < size; i++) {

                   char c = (char) (buffer[i] + 10);
                   System.out.print(c);
               }
           }
       } catch (IOException ioe) {
           throw new IllegalStateException("Can not decode file", ioe);
       }
   }


    public static void main(String[] args) {
        new Decoder().decode(Path.of("secret.dat"));
    }
}
