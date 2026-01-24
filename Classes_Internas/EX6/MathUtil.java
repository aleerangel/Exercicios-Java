public class MathUtil {
    public static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = MathUtil.Calculator.add(a, b);
        System.out.println("Soma: " + c);
    }
}