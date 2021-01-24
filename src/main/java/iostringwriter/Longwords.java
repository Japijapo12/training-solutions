package iostringwriter;


import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class Longwords {

    public void writeLongWords(Writer writer, List<String> words) {

        StringWriter stringWriter = new StringWriter();
        try (stringWriter) {
            for (String word : words) {
                writer.write(word);
                writer.write(": ");
                writer.write(word.length());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write  file", e);
        }
    }


    public String writeWithStringWriter(List<String> words) {

        try(StringWriter sw = new StringWriter()){
            writeLongWords(sw, words);
            return sw.toString();

        } catch (IOException e) {
            throw new IllegalStateException("Can not write to String!", e);
        }
    }

}
