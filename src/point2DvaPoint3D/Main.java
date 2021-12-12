package point2DvaPoint3D;


public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(33,45);
        point2D.setXY(88,55);
        point2D.getXY();

        Point3D point3D  = new Point3D(33,55,116);
        point3D.setXYZ(33,45511,44);
        System.out.println(point3D);

        MoveablePoint moveablePoint = new MoveablePoint(241,56,6,2);
        System.out.println(moveablePoint);
       

    }
}
