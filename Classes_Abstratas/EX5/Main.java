public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Manager("Alexandre", 6000, 7000);
        employees[1] =  new Programmer("Geraldo", 5000, 20, 25.0);
        
        for(Employee employer : employees) {
            employer.displayInfo();
        }
    }
}