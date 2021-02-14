package exam02;

import java.util.Arrays;

public class ArraySelector {


    public String selectEvens(int[] values) {
        String str = "";
        if ( values.length < 1) {
            return "";
        }

        int[] newValues = new int[(int)Math.round(values.length / 2.0)];

        for ( int i = 0; i < values.length; i++) {
           if (i % 2 == 0) {
              newValues[i/2] = values[i];
            }

        }
        return Arrays.toString(newValues);
    }

    public static void main(String[] args) {
        ArraySelector arraySelector = new ArraySelector();
        System.out.println(arraySelector.selectEvens(new int[]{1,2,3,4,5}));
    }

}

/*Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat, és egy szövegként összerak,
szögletes zárójelek között!
A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.
Ha nulla elemű a tömb, akkor üres stringet adjon vissza!*/
