package week03d02;

import java.util.ArrayList;
import java.util.List;


public class Position {

    private String name;
    private int bonus;


    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("CEU", 160_000));
        positions.add(new Position("employee", 80_000));

        for (Position position : positions) {
            if (position.getBonus() > 150000) {
                System.out.println(position.toString());
            }
        }



    }


}

//Írj egy Position osztályt, melynek van egy name és egy bonus attribútuma!
// Egy alkalmazotti pozíciót jelöl, melynek a bonus attribútuma tárolja,
// hogy ebben a pozícióban évente mennyi bónuszt kap egy alkalmazott.
// A main metódusban hozz létre egy Position objektumokat tartalmazo listát!
//
//Menj végig a lista elemein, és írd ki azokat, ahol a bónusz magasabb, mint 150_000.
// Azonban a kiírás formátumát a Position osztály toString() metódusában implementáld!


