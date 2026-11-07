

public class CircleArea {

    public double calculateArea(double radius) {

        if (radius < 0) {
            throw new IllegalArgumentException(
                "Radius cannot be negative");
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        CircleArea c = new CircleArea();

        double radius = 5;

        System.out.println(
            "Area of Circle: " + c.calculateArea(radius));
    }
}
