public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));
        System.out.println("Divide: " + calc.divide(6, 3));

        // Edge case: divide by zero
        System.out.println("Divide by zero test: " + calc.divide(10, 0));
    }
}