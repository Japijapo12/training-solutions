package introdate;


import java.time.LocalDate;
import java.time.Month;

public class IntroDateMain {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.NOVEMBER,25);
        System.out.println(date);

        LocalDate now = LocalDate.now();
        System.out.println(now);
    }
}
