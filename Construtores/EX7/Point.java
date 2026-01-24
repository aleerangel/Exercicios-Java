public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double u) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void imprimir() {
        System.out.println("Point (x,y): (" + x + ", " + y + ")");
    }
}