package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CapsulesMain {

    public static void main(String[] args) {
        arraylist.Capsules capsules = new arraylist.Capsules();
        capsules.addLast("yellow");
        capsules.addLast("yellow");
        capsules.addLast("red");
        capsules.addLast("yellow");


        System.out.println(capsules.getColors());

        capsules.addLast("white");
        System.out.println(capsules.getColors());

        capsules.addFirst("blue");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());

    }


}
