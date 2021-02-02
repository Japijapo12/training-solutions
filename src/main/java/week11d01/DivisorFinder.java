package week11d01;

public class DivisorFinder {

   public int findDivisors(int n) {
        int result = 0;
        String number = Integer.toString(n);
        for (int i =0; i<number.length(); i++) {
          if ( n % Integer.parseInt(String.valueOf(number.charAt(i))) == 0 ) {
              result ++;
          }
        }
        return result;
    }
}



//Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int findDivisors(int n) metódusa.
// A feladat az, hogy megnézzük a szám minden egyes számjegyére, hogy osztója-e a számnak,
// majd számoljuk össze őket. Példa: a 425-ben az 5 osztója a számnak, ezért a visszatérési érték 1.
