package exam02;

public class ArraySelector {


    public String selectEvens(int[] events) {
        String str = "";
        if ( events == null) {
            return "";
        }

        for ( int i = 0; i < events.length; i++) {


            if (i % 2 == 0) {
              str =  "[" + str + ( (events[i] + ", ").toString()) + "]";
            }

        }
        return str;
    }



}
