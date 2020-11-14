package statements;

public class Time {
    int h;
    int m;
    int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getInMinutes() {
        int hourInMinutes = h*60 + m;
        return hourInMinutes;

    }

    public String toString() {
        return h + ":" + m + ":" + s;
    }

    public int getInSeconds() {
        int hourInseconds = getInMinutes() * 60 + s;
        return hourInseconds;

    }

    public boolean earlierThen(Time other) {
        int time1InSeconds = this.getInSeconds();
        int time2InSeconds = other.getInSeconds();
        return time1InSeconds > time2InSeconds;
    }





}
