public class Student {
    private int studentId; 
    private String studentName;
    private String grade;

    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade; 
        System.out.println("Id: " + studentId + " Nome: " + studentName + " Grade: " + grade);
    }

    public Student() {
        this(0, "Sem nome", "N/A");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Alexandre", "CC");
    }
}