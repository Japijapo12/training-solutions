package week02;

public class Phone {
    String type;
    int mem;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }
}
