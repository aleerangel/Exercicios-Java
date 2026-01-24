public class Initializer {
    static int initialValue;

    static {
        initialValue = 1000;
        System.out.println("Bloco estatico: initialValue inicializado em " + initialValue);
    }

    public static void main(String[] args) {
        System.out.println("Antes de criar uma instancia: initialValue = " + Initializer.initialValue);

        Initializer initializer = new Initializer();

        //acessando pela classe
        System.out.println("Depois de criar uma instancia: " + Initializer.initialValue);      
        //acessando pela instancia
        System.out.println("Depois de criar uma instancia: " + initializer.initialValue);      
    }
}