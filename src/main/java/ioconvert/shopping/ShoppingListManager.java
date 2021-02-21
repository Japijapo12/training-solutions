package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {
    //outputstreamre írja ki a szöveges listát (szövegként)
    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))) {
            for (String item : shoppingList) {
                bw.write(item);
                bw.newLine();
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }


    }


    //szöveglistát olvas be inputstreamből
    public List<String> loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }
}



/*
Bevásárlólista
Az ioconvert.shopping csomagba készíts egy ShoppingListManager osztályt! A
saveShoppingList() metódusa a paraméterül kapott OutputStream-re kiírja a szintén
paraméterül kapott List<String> tartalmát szövegként, minden elemet külön sorba. A
loadShoppingList() metódusa a paraméterül kapott Inputstream-ből beolvassa a
bevásárlólista tartalmát, amit szöveglistaként ad vissza.
 */
