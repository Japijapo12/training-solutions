package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] imageParts, Path path) {

        try(BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
            for ( byte[] part : imageParts) {
            os.write(part);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }
}






//Darabokban érkező kép
//Hozz létre egy ImageAssembler osztályt, melyben a makeImageFile() metódus a
//paraméterben a kép részleteit byte[][]-ként kapja meg, majd a részeket kiírja egyetlen
//image.png nevű fájlba a Path-ként kapott mappába!
