public class Singleton {
    private static Singleton singleInstance = null;
    
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if(singleInstance == null) {
            singleInstance = new Singleton();
        }

        return singleInstance;
    }

    public static void main(String[] args) {
        Singleton stance1 = Singleton.getInstance();
        Singleton stance2 = Singleton.getInstance();

        if(stance1 == stance2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are different");
        }
    }
}