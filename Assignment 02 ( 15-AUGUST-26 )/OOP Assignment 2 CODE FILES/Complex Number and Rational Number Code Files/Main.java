//Name : Ahmed Ali 
//BSCS-B S.NO 5
//B25110006009

public class Main {
    public static void main(String[] args) {

        // ==========================================
        //           RATIONAL NUMBERS
        // ==========================================

        System.out.println("========== RATIONAL NUMBERS ==========");

        // Testing Default Constructor
        RationalNum r1 = new RationalNum();
        System.out.println("\ntesting Defualt Constructor");
        System.out.println("Default Rational Number: " + r1);

        // Testing Parameterized Constructor
        System.out.println("\ntesting Parameterized Constructors");
        RationalNum r2 = new RationalNum(3, 4);
        RationalNum r3 = new RationalNum(2, 5);

        System.out.println("Rational Number r2: " + r2);
        System.out.println("Rational Number r3: " + r3);

        // Testing Addition
        System.out.println("\nTesting Addition ");
        RationalNum rAdd = r2.add(r3);
        System.out.println("Addition: " + rAdd);

        // Testing Subtraction
        System.out.println("\nTesting Subtraction ");
        RationalNum rSub = r2.sub(r3);
        System.out.println("Subtraction: " + rSub);

        // Testing Multiplication
        System.out.println("\nTesting Multiplication ");
        RationalNum rMult = r2.mult(r3);
        System.out.println("Multiplication: " + rMult);

        // Testing Division
        System.out.println("\nTesting Division ");
        RationalNum rDiv = r2.divide(r3);
        System.out.println("Division: " + rDiv);

        // Testing Copy Constructor
        System.out.println("\nCopying An Object using Copy Constructor");
        RationalNum r4 = new RationalNum(r2);
        System.out.println("Copied Rational Number: " + r4);

        // Testing toString()
        System.out.println("\n ");
        System.out.println("Using toString(): " + r2.toString());


        // Testing Denominator Cannot Be Zero
        System.out.println("\nTesting Zero Denominator:");

        try {
            RationalNum r5 = new RationalNum(5, 0);
            System.out.println(r5);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        // ==========================================
        //           COMPLEX NUMBERS
        // ==========================================

        System.out.println("\n========== COMPLEX NUMBERS ==========");

        // Testing Default Constructor
        ComplexNum c1 = new ComplexNum();
        System.out.println("\nTesting Default Constructor ");
        System.out.println("Default Complex Number: " + c1);

        // Testing Parameterized Constructor
        System.out.println("\nTesting Parameterized Constructor ");
        ComplexNum c2 = new ComplexNum(3, 4);
        ComplexNum c3 = new ComplexNum(2, 5);

        System.out.println("Complex Number c2: " + c2);
        System.out.println("Complex Number c3: " + c3);

        // Testing Addition
        System.out.println("\nTesting Addition ");
        ComplexNum cAdd = c2.addComplexNum(c3);
        System.out.println("Addition: " + cAdd);

        // Testing Subtraction
        System.out.println("\nTesting Subtraction");
        ComplexNum cSub = c2.subComplexNum(c3);
        System.out.println("Subtraction: " + cSub);

        // Testing Multiplication
        System.out.println("\nTesting Multiplication ");
        ComplexNum cMult = c2.multComplexNum(c3);
        System.out.println("Multiplication: " + cMult);

        // Testing Copy Constructor
        System.out.println("\nTesting Copy Constructor ");
        ComplexNum c4 = new ComplexNum(c2);
        System.out.println("Copied Complex Number: " + c4);

        // Testing toString()
        System.out.println("Using toString(): " + c2.toString());
    }
}
