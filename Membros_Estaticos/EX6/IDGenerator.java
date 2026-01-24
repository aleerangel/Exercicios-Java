public class IDGenerator {
    private static int nextID = 1;

    public static int generateID() {
        return nextID++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int ID = IDGenerator.generateID();
            System.out.println(ID + " ");
        }
    }
}