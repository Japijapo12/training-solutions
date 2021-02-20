package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {
//számok beolvasása szkennerrel delimiter megadásával useDelimiter() metódussal
    public int readAndSumValues(String intString, String delimiter) {

        try (Scanner scanner = new Scanner((intString))) {
            if (!isEmpty(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    public int calculateWithScanner(Scanner scanner) {
        int sum = 0;
        try {
            while(scanner.hasNext()) {
                sum += scanner.nextInt();
            }

        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }
        return sum;
    }

    //számok beolvasása szkennerrel delimiter nélkül
    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);
    }

//többsoros szövegből kiszűrni azokat a sorokat, melyek tartalmazzák a paraméterként kapott szót
    public String filterLinesWithWordOccurrences(String text, String word) {
        if(isEmpty(text) || word == null || "".equals(word)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        try (Scanner scanner = new Scanner(text)) {
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.contains(word)) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }
            }
            return stringBuilder.toString().trim();
        }
    }


    private boolean isEmpty(String str) {
        return str == null ||"".equals(str.trim());
    }
}
