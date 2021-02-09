package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public double distance(Point otherPoint) {
        return (long) Math.sqrt(
                Math.pow((double)x - otherPoint.getX(), 2) +
                        Math.pow((double)y - otherPoint.getY(), 2)
        );
    }
}


//public static double pow(double a, double b)
//This method returns 'a' a b-edik hatványon.

//public static double sqrt(double a) - gyökvonás
//
