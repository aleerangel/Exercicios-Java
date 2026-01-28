public class Main {
    public static void main(String[] args) {
        Vehicle[] myGarage = new Vehicle[2];
        myGarage[0] = new Car();
        myGarage[1] = new Motorcycle();

        for(Vehicle vehicle : myGarage) {
            vehicle.startEngine();
            vehicle.stopEngine();
        }
    }
}