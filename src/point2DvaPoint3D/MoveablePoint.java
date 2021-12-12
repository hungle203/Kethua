package point2DvaPoint3D;

public class MoveablePoint extends Point2D{
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double[] setSpeed(double xSpeed, double ySpeed) {
        double[] arr = {getxSpeed(),getySpeed()};
        return arr;
    }
    public MoveablePoint moveablePoint() {
        double x = super.getX();
        double y = super.getY();
        x += xSpeed;
        y += ySpeed;
        setX(x);
        setY(y);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{ x= " + getX()
                + ", y= " + getY()
                + ", xSpeed=" + xSpeed
                + ", ySpeed=" + ySpeed
                + "} ";

    }
}
