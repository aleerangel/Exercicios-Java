public class Main {
    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[2];
        shapes[0] = new Sphere(10.0);
        shapes[1] = new Cube(10.0);
        for(Shape3D shape : shapes) {
            shape.print();
        }
    }
}