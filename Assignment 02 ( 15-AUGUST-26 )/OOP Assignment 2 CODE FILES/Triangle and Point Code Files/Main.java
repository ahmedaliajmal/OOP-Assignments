//Name : Ahmed Ali 
//BSCS-B S.NO 5
//B25110006009

public class Main {
    public static void main(String[]args){
//      **********************************************
        //Note : All the Commenting and Codes here are done by myself.
        //Ahmed Ali (B25110006009) BSCS-B OOP;
//      **********************************************
        

        //Creating three Point Objects
        Point p1 = new Point(12 ,14);
        Point p2 = new Point(10,21);
        Point p3 = new Point(12,11);

        //Showing Addition of Two Point Objects
        Point sum = p1.addPoints(p3); //Expected output (24.0,25.0) VERIFIED.
        System.out.println("Addition : "+ sum);

        //Showing Subtraction of Two Point Objectss
        Point sub = p1.subtractPoints(p2); // Expected output (2.0, -7.0) VERIFIED.
        System.out.println("Subtraction : "+ sub );

        //Creating A Fourth Point Object Using Copy Constructor
        Point p4 = new Point(p1);

        //Calling that fourth point Object using toString()
        System.out.println();
        System.out.println(p4); //or
        System.out.println(p4.toString());

        //Creating Traingle Object using Point;
        Triangle t1 = new Triangle(p1,p2,p3);

        //Showing Triangle Points using toString()
        System.out.println("\nThe Points of triangle are: ");
        System.out.println(t1);


        //Testing Triangle copy Constructor
        Triangle t2 = new Triangle(t1);
        System.out.println("\nNew Triangle t2 Created Using t1 Copy Constructor");
        System.out.println(t2);

        //Testing Defualt Constructor
        Triangle t3 = new Triangle();
        System.out.println("\nTesting Defualt Constructor Creating T3 Object");
        System.out.println(t3);


    }
}
