package point2DvaPoint3D;

public class Point3D extends Point2D {
    private double z = 0.0;

    public Point3D() {

    }
    public Point3D(double x, double y, double z ) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double Z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public double[] getXYZ() {
        double[] array = {this.getX(), this.getY(), this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D " +
                "centerZ=" + this.getX() +
                ", centerY=" + this.getY() +
                "centerZ=" + z + "}";
    }
}
