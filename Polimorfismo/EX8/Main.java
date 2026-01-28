public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7.0);
        Shape square = new Square(12.0);
        Shape triangle = new Triangle(5.0, 3.0);

        drawShapeAndCalculateArea(circle);
        drawShapeAndCalculateArea(square);
        drawShapeAndCalculateArea(triangle);

    }

    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}