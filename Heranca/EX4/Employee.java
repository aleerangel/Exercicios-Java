public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an employee");
    }

    public double getSalary() {
        return salary;
    }
}