public class Rectangle extends Shape {
    private double lenght;
    private double widht;

    public Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    @Override
    public double getArea() {
        return lenght * widht;
    }
}