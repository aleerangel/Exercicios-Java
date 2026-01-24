public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal() {
            @Override 
            void makeSound() {
                System.out.println("Au au");
            }
        };
        cachorro.makeSound();
    }
}