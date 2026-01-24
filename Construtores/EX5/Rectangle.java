public class Rectangle {
    private double lenght;
    private double widht;

    public Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    public Rectangle(Rectangle original) {
        this.lenght = original.lenght;
        this.widht = original.widht;
    }

    public void imprimirValores() {
        System.out.println("Lenght: " + lenght + " Widht:" + widht);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(2, 1);
        Rectangle r3 = new Rectangle(r1);
        r1.imprimirValores();
        r2.imprimirValores();
        r3.imprimirValores();
    }
}
