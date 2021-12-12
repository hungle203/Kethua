package baitapTriangle;

public class Main{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println( "Chu vi là: " + triangle.getPerimeter());
        System.out.println("Diện tích là: " + triangle.getArea());
        System.out.println("==========================");

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println( "Chu vi là:" + triangle1.getPerimeter());
        System.out.println("Diện tích là: " + triangle1.getArea());
    }
}
