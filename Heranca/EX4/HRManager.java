public class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @override 
    public void work() {
        System.out.println("The HR manager is working");
    }

    public void addEmployee() {
        System.out.println("Adding employees");
    }
}