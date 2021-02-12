package week15d05;

import java.util.ArrayList;
import java.util.List;

public class splitDemo {
    public static void main(String[] args) {
        String s = "alma,, \"korte, korte\", meggy,";
        StringBuilder sb = new StringBuilder();
        List<String> parts = new ArrayList<>();
        boolean insideValue = false;
        for (char c: s.toCharArray()) {
            if (c == '\"') {
                insideValue = !insideValue;
            }
            if (c != ',') {
                sb.append(c);
            }
            else {
                if (!insideValue) {
                    parts.add(sb.toString());
                    sb = new StringBuilder();
                } else {
                    sb.append(",");
                }
            }
        }
        parts.add(sb.toString());
        for (String element: parts) {
            System.out.println(element);
        }
    }
}
