package week13d04;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {

        try {
            StringBuilder sb = new StringBuilder();
            String line = Files.readString(file);


            for (Employee employee : employees) {
            //    System.out.println(line);
                String replaced = line.replace("{nev}", employee.getName());
                replaced = replaced.replace("{ev}", Integer.toString(employee.getYearOfBirth()));
                sb.append(replaced).append("\n");

            }
            return sb.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }


    public static void main(String[] args) {
        Path path = Path.of("employee-template.txt");

        List<Employee> employees =
                List.of(
                        new Employee("John Doe", 1980),
                        new Employee("Jack Doe", 1980)
                );
        String result = new TemplateMerger().merge(path, employees);
        System.out.println(result);

    }
}




//Az alkalmazott neve: {nev}, születési éve: {ev}

//Olyan, minta Word körlevél