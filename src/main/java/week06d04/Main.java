package week06d04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(Arrays.asList(
                new Item("fogkefe",120,11),
                new Item("keksz",120,10),
                new Item("kóla",120,12)
        ));
        System.out.println(budget.getItemsByMonth(11));


    }
}
