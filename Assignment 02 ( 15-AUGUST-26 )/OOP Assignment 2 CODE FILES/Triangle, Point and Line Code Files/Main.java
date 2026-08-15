//Name : Ahmed Ali 
//BSCS-B S.NO 5
//B25110006009

public class Main {
    public static void main(String[] args) {

//      **********************************************
        //Note : All the Commenting and Codes here are done by myself.
        //Ahmed Ali (B25110006009) BSCS-B OOP;
//      **********************************************

        Point p1 = new Point(12, 14);
        Point p2 = new Point(10, 21);
        Point p3 = new Point(12, 11);
        Point p4 = new Point(4, 6);

        System.out.println("Point p1:");
        System.out.println(p1);

        p1.setX(15);
        p1.setY(18);

        System.out.println("\nAfter Using Point Setters:");
        System.out.println(p1);

        System.out.println("\nPoint Getters:");
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        System.out.println("\nLine l1:");
        System.out.println(l1);

        System.out.println("\nLine l2:");
        System.out.println(l2);

        l1.setA(p3);
        l1.setB(p4);

        System.out.println("\nLine l1 After Setters:");
        System.out.println(l1);

        System.out.println("\nLine Getters:");
        System.out.println("A = " + l1.getA());
        System.out.println("B = " + l1.getB());

        Line sum = l1.add(l2);

        System.out.println("\nAddition of l1 and l2:");
        System.out.println(sum);

        Line sub = l1.subtract(l2);

        System.out.println("\nSubtraction of l1 and l2:");
        System.out.println(sub);

        Line l3 = new Line(l1);

        System.out.println("\nLine l3 Created Using Copy Constructor:");
        System.out.println(l3);

        Point intersection = l1.intersection(l2);

        System.out.println("\nIntersection of l1 and l2:");

        if (intersection != null) {
            System.out.println(intersection);
        } else {
            System.out.println("Lines are parallel.");
        }

        Line AB = new Line(p1, p2);
        Line BC = new Line(p2, p3);
        Line CA = new Line(p3, p1);

        Triangle t1 = new Triangle(AB, BC, CA);

        System.out.println("\nTriangle t1:");
        System.out.println(t1);

        t1.setAB(BC);
        t1.setBC(CA);
        t1.setCA(AB);

        System.out.println("\nTriangle t1 After Setters:");
        System.out.println(t1);

        System.out.println("\nTriangle Getters:");
        System.out.println("AB:\n" + t1.getAB());
        System.out.println("BC:\n" + t1.getBC());
        System.out.println("CA:\n" + t1.getCA());

        Triangle t2 = new Triangle(t1);

        System.out.println("\nTriangle t2 Created Using Copy Constructor:");
        System.out.println(t2);

        Triangle t3 = new Triangle();

        System.out.println("\nTriangle t3 Created Using Default Constructor:");
        System.out.println(t3);
    }
}