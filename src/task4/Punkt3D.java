package task4;

public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D(Punkt2D punkt2D, int z) {
        super(punkt2D.getX(), punkt2D.getY());
        this.z = z;
    }


    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punkt3D{" +
                "z=" + z +
                '}' + super.toString();
    }


}

