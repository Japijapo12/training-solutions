package math.game;

import java.util.Random;

public class Warrior {

    private final Random rnd = new Random();

    private String name;
    private Point position;
    private int stamina;
    private double skill;

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = rnd.nextInt(81) + 20;  //életereje 20 és 100 között generálódik véletlenszerűen
        skill = rnd.nextDouble();  //ügyessége egy lebegőpontos szám 0 és 1 között
    }

    public void move(Warrior forward) {
        int newX = position.getX();
        int newY = position.getY();
        if (forward.getPosition().getX() - position.getX() > 0) {
            newX++;
        } else if (forward.getPosition().getX() - position.getX() < 0) {
            newX--;
        }
        if (forward.getPosition().getY() - position.getY() > 0) {
            newY++;
        } else if (forward.getPosition().getY() - position.getY() < 0) {
            newY--;
        }
        position = new Point(newX, newY);
    }

    public double distance(Warrior other) {
        return position.distance(other.position);
    }

    public void attack(Warrior warrior) {
        if (rnd.nextDouble() < skill) {                    // ha kisebb mint az ügyessége, csökk.
            warrior.stamina -= rnd.nextInt(3) + 1;  //csökken az életereje ~1-3-mal
        }
    }

    public boolean isAlive() {
        return stamina > 0;
    }

    public String toString() {
        return name + ": (" + position.getX() + "," + position.getY() + ") " + stamina;
    }

    public Point getPosition() {
        return position;
    }
}
