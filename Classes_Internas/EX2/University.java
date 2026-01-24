public class University {
    
    static class Department {
        private String departmentName;
        private int facultyCount;

        public Department(String departmentName, int facultyCount) {
            this.departmentName = departmentName; 
            this.facultyCount = facultyCount;
        }

        public void displayInfo() {
            System.out.println("Department: " + departmentName);
            System.out.println("Number of faculty members: " + facultyCount);
        }
    }

    public static void main(String[] args) {

        University.Department compSciDept = new University.Department("Computer Science", 50);

        compSciDept.displayInfo();
    }
}