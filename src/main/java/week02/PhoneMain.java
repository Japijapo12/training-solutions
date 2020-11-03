package week02;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", 4 );
        Phone phone2 = new Phone("Nokia", 2 );

        System.out.println(phone1.getType() +"" + phone1.getMem());
        System.out.println(phone2.getType() +"" + phone2.getMem());


    }
}
