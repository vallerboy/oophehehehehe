package task4;

public class Punkt2D {
    private int x, y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2D() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
