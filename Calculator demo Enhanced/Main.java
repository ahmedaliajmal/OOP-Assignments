public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));


        System.out.println("Divide: " + calc.divide(6, 3));
    
        try {
            System.out.println("Divide by zero: " + calc.divide(6, 0));
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error: " + e.getMessage());
        }

        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Power edge (exp 0): " + calc.power(5, 0));

        
        System.out.println("Modulus: " + calc.modulus(10, 3));
        try {
            System.out.println("Modulus by zero: " + calc.modulus(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Modulus error: " + e.getMessage());
        }
    }
}