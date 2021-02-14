package exam02.cv;

public class Skill {

    private String name;
    private final int level;

    public Skill(String name, int level) {
       if (level < 1 || level >5) {
           throw new IllegalArgumentException("A level csak 1 és 5 közötti érték lehet!");
       }
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return name + " (" + level + ")";
    }
}
