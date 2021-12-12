package Baitap.lopCircleandlopCylinder;

public class Cylinder extends  Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//    public double getArea() {
//        return
//    }

    public double getVolume() {
      return getHeight() * Math.PI * Math.pow(getRadius(),2);

    }

    @Override
    public String toString() {
        return "A height " + getHeight()
                +", Volume " + getVolume();

    }
}