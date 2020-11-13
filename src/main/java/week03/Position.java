package week03;

import java.util.ArrayList;
import java.util.List;


public class Position {

    private int bonus;
    private String name;

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


    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("CEU", 160_000));
        positions.add(new Position("employee", 80_000));

        for (Position position : positions) {
            if (position.getBonus() > 150000) {
                System.out.println(position);
            }
        }

    }


}


