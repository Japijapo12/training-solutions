package week14d02;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OnlineShopping {
    private Map<String, List<String>> shoppingList = new LinkedHashMap<>();

    public void readFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String[] items = parts[1].split(",");
                List<String> result = new ArrayList<>();
                for (String s : items) {
                    result.add(s);
                }
                shoppingList.put(parts[0], result);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
    public List<String> getItemById(String id) {
        List<String> result = new ArrayList<>(shoppingList.get(id));
        Collections.sort(result);
        return result;
    }
    public List<String> getItemByIdReversed(String id) {
        List<String> result = getItemById(id);
        Collections.reverse(result);
        return result;
    }
    public int getNumberOfItemsSell(String input) {
        int count = 0;
        Collection<List<String>> values = shoppingList.values();
        List<String> result= new ArrayList<>();
        for(List<String> item : values) {
            for(String s : item) {
                if(s.equals(input)) {
                    count++;
                }
            }
        }
        return count;
    }
    public int getNumberOfItemsById(String id) {
        return shoppingList.get(id).size();
    }
    public Map<String,Integer> shoppingListStatistics() {
        Map<String,Integer> result = new HashMap<>();
        for(List<String> item : shoppingList.values()) {
            for(String s : item) {
                int count = getNumberOfItemsSell(s);
                result.put(s,count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        OnlineShopping os = new OnlineShopping();
        os.readFile(Path.of("src/main/resources/shopping.txt"));
        List<String> result = os.getItemById("B3402");
        System.out.println(result);
        List<String> resultReverse = os.getItemByIdReversed("B3402");
        System.out.println(resultReverse);
        int resultCount = os.getNumberOfItemsSell("tomato");
        System.out.println(resultCount);
        int sizeList = os.getNumberOfItemsById("B3402");
        System.out.println(sizeList);
        Map<String,Integer> resultMap = os.shoppingListStatistics();
        System.out.println(resultMap);


    }
}

/*
Adott egy fájl melyben online bevásárlások találhatók. A fájl a még ki nem szállított rendeléseket tartalmazza. Egy sorban egy egyedi azonosító és utána a termékek neve van felsorolva. Minden vásárlás legalább 2 termékből áll.
```
A233 bread,tomato,flour,sugar
A312 sugar,beer,apple,pear
B3402 meet,soda,cola,bbq_sauce
B341 pasta,passata,basil,cheese
A10 corn,hot_dog,rolls
CM231 beer,chips
C123 pepper,salt,rosmary,pizza_dough,passata,oregano
W34111 pasta,sugar,rosmary,cheese,meet,carrot,potato,tomato
K8921 wine,soda
```Olvasd be a fájlt és tárold el az adatokat a memóriában, majd oldd meg a következő feladatokat.
1. Egyedi azonosító alapján legyenek lekérdezhetőek a vásárolt termékek ABC sorrendben.
2. Számoljuk össze, egy termék neve alapján, hogy abból a termékből mennyit adtak el.
3. Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.

 */