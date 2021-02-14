package arrays;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.min;

public class ArrayMain {

    public String NumberOfDaysAsString() {
        int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberOfDays);
    }


    public List<String> daysOfWeek() {
        return Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök","Péntek","Szombat", "Vasárnap");
    }


//A multiplicationTableAsString(int size) metódus definiáljon egy size méretű
//szorzótáblát, és adja vissza az értékeket String-ként egy sorban.

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }



    //A sameTempValues(double[] day, double[] anotherDay) hőmérsékleti értékeket vár,
    //órai mérésekkel, két napra. Vizsgáld meg, hogy a paraméterként megadott két nap
    //azonos méréseket tartalmazott-e!

    boolean sameTempValues(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);  // Math.min osztály metódusa  - megnézi, melyik tömb a kisebb, azt adja vissza
        double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);  //a tömb megadott indexek közötti szakaszát adja vissza
        double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(rangeOfDay, rangeOfAnotherDay);  // összehasonlítja a két tömböt
    }



 //Döntsd el a boolean wonLottery(int[], int[]) metódusban, hogy a megtett számok,
    //és a kihúzott számok megegyeznek-e! Nem biztos, hogy növekvő sorrendben vannak a
    //számok. Azaz ellenőrizd, hogy ugyanazokat az értékeket tartalmazza-e a két paraméter,
    //sorrendtől függetlenül!
    //Válaszd azt a megoldást, hogy mindkét tömböt rendezed, és úgy hasonlítod őket össze!

    public boolean wonLottery(int[] winner, int[] stake) {
        int[] copyOfWinner = Arrays.copyOf(winner, winner.length);
        int[] copyOfStake = Arrays.copyOf(stake, stake.length);
        Arrays.sort(copyOfWinner);
        Arrays.sort(copyOfStake);
        return Arrays.equals(copyOfWinner, copyOfStake);
    }






    public static void main(String[] args) {
        ArrayMain arrayMain = new ArrayMain();
        System.out.println(arrayMain.NumberOfDaysAsString());

        System.out.println(arrayMain.daysOfWeek());

        System.out.println(arrayMain.multiplicationTableAsString(10));


        System.out.println(arrayMain.sameTempValues(new double[] {1, 2, 3}, new double[] {1, 2, 3}));
        System.out.println(arrayMain.sameTempValues(new double[] {1, 2, 3}, new double[] {2, 2, 3}));
        System.out.println(arrayMain.sameTempValues(new double[] {1, 2}, new double[] {1, 2, 3}));
        System.out.println(arrayMain.sameTempValues(new double[] {1, 3}, new double[] {1, 2, 3}));

        int[] winner = new int[]{1, 2, 3, 4, 5};
        int[] stake = new int[]{5, 4, 3, 2, 1};
        System.out.println(arrayMain.wonLottery(winner, stake));
        System.out.println(Arrays.toString(stake));

        System.out.println(arrayMain.wonLottery(new int[]{1, 2, 3}, new int[]{1, 2, 2}));
    }

}
