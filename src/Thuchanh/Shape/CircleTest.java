package Thuchanh.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

//        circle = new Circle(3.5);
//        System.out.println(circle);

        circle = new Circle(4.4, "indigo", false);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
    }
}
