package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr){
        if(arr.length < 4) {
            throw new IllegalArgumentException("The list must consist of at least 4 items!");
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < 4; i ++) {
            sum += arr[i]
        }
        return sum;
    }
}



//x	week10d05 Készítsünk egy Calculator nevű osztályt, melynek van egy findMinSum(int[] arr) metódusa.
// A metódus feladata, hogy kiírja a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
// Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16