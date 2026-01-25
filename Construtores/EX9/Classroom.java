public class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public void printClassroom() {
        System.out.println("Class name: " + className);
        System.out.println("Students: ");
        for(String student : students) {
            System.out.println(student + " ");
        } 
        System.out.println();
    }

    public static void main(String[] args) {
        String[] studentArray = {"Alexandre", "Bruno", "Geraldo"};
        Classroom classroom = new Classroom("PROG II", studentArray);
        classroom.printClassroom();
    }
}