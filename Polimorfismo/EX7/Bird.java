public class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }    

    @Override
    public void makeSound() {
        System.out.println("Bird chirps"); 
    }
}