package week13d04;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    List<Employee> employeesData = new ArrayList<>();

    public String merge(Path file, List<Employee> employees) {

        try(BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while (( line = reader.readLine()) != null){
                String linePart = line.replace("Az alkalmazott neve: ","");
                String linePart2 = linePart.replace(" születési éve: ","" );

                //ez maradt már csak: John Doe,1980
                String[] employeesParts = linePart2.split(",");
                Employee employee = new Employee(employeesParts[0], employeesParts[1]);
                employeesData.add(employee);

            }
        }
        catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }

        for (Employee employee : employeesData) {
            return employeesData.toString();
        }

    }

    public List<Employee> getEmployeesData() {
        return employeesData;
    }
}




//Az alkalmazott neve: {nev}, születési éve: {ev}