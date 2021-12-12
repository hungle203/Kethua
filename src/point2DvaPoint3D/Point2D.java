package point2DvaPoint3D;

import java.time.Year;

public class Point2D {
    private double x = 0.0;
    private double y = 0.0;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double X, double Y) {
        this.setX(x);
        this.setY(y);
    }
    public double[] getXY() {
        double[] array = {this.getX(),this.getY()};
        return array;
    }

    @Override
    public String toString() {
        return "point2D {" +
                "centerX=" + getX() +
                ",centerY=" + getY() +
                '}';
    }
}
