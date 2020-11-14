package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(week[1] + " A tömb hossza: " + week.length);


        // 2 hatványai

        int[] exp = new int[8];
        exp[0] = 1;
        for (int i = 1; i < exp.length; i++) {
            exp[i] = exp[i - 1] * 2;
        }

        for (int power: exp) {
            System.out.println(power);
        }

        //felváltva true,false

        boolean[] booleans = new boolean[6];
        booleans[0] = false;
        for (int i = 1; i < booleans.length; i++) {
            booleans[i] = !booleans[i - 1];
        }

        for (boolean b: booleans) {
            System.out.println(b);
        }


    }
}
