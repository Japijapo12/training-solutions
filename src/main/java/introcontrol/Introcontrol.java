package introcontrol;

import java.util.Scanner;

public class Introcontrol {
    int number;

    public int substractTenIfGreaterThanTen(int number) {

        if (number <= 10) {
            return number;
        } else {
            return (number - 10);
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if ("Joe".equals(name)) {
            return ("Hello Joe");
        } else {
            return ("");
        }
    }

    public int calculateBonus(int sale) {
        if (sale >= 1_000_000) {
            return sale / 10;
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (prev <= next) {
            return next - prev;
        } else {
            return 10000 - prev + next;
        }
    }

    public void printNumbers(int max) {
        int i;
        for (i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumberBetween(int min, int max) {
        int k;
        for (k = min; k <= max; k++) {
            System.out.println(k);
        }
    }

    public void printNumberBetweenAnyDirection(int a, int b) {
        int j;
        if (b >= a) {
            for (j = a; j <= b; j++) {
                System.out.println(j);
            }
        } else {
            for (j = a; j >= b; j--) {
                System.out.println(j);
            }
        }
    }

    public void printOddNumbers(int max) {
        int p;
        for (p = 1; p <= max; p = p + 2) {
            System.out.println(p);
        }
    }


}
