public class House {

    public void calculateArea() {
        final double comprimento = 12.5;
        final double largura = 7.0;
        class Room {
            public double getArea() {
                return comprimento * largura;
            }
        }
        Room room = new Room();
        double area = room.getArea();
        System.out.println("Area do comodo: " + area);
    }

    public static void main(String[] args) {
        House house = new House();
        house.calculateArea();
    }

}