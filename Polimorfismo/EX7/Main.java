public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal panthera = new Panthera();

        performAction(bird);
        performAction(panthera);
    }

    public static void performAction(Animal animal) {
        animal.move();
        animal.makeSound();
    }
}