public class Computer {

    class Processor{
        void displayDetails() {
            System.out.println("Marca do processador: Intel");
            System.out.println("Velocidade do processador: 3.5 GHz");
        }
    }

    void showProcessorDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.showProcessorDetails();
    }
}