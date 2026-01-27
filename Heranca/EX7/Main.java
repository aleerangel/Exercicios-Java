public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alexandre", "Rangel", 2709, "Vagabundo");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
    }
}