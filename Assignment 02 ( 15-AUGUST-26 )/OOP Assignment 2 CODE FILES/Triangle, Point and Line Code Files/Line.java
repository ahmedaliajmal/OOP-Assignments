public class Line {
    private Point A;
    private Point B;

    //Defualt Constructor
    Line() {
        this.A = new Point();
        this.B = new Point();
    }

    //Parameterized Constructor
    Line(Point A, Point B) {
        this.A = new Point(A);
        this.B = new Point(B);
    }

    //Copy Constructor
    Line(Line obj) {
        this.A = new Point(obj.A);
        this.B = new Point(obj.B);
    }

    //Setter
    public void setA(Point A) {
        this.A = new Point(A);
    }

    //Setter
    public void setB(Point B) {
        this.B = new Point(B);
    }

    //Setter
    public void setPoints(Point A, Point B) {
        this.A = new Point(A);
        this.B = new Point(B);
    }

    //Getter
    public Point getA() {
        return new Point(A);
    }

    //Getter
    public Point getB() {
        return new Point(B);
    }

    //ADD Function or Method
    public Line add(Line obj) {
        Point newA = this.A.addPoints(obj.A);
        Point newB = this.B.addPoints(obj.B);
        return new Line(newA, newB);
    }

    //Subtract Method
    public Line subtract(Line obj) {
        Point newA = this.A.subtractPoints(obj.A);
        Point newB = this.B.subtractPoints(obj.B);
        return new Line(newA, newB);
    }

    //Intersection of two Lines
    public Point intersection(Line obj) {
        float x1 = A.getX();
        float y1 = A.getY();
        float x2 = B.getX();
        float y2 = B.getY();

        float x3 = obj.A.getX();
        float y3 = obj.A.getY();
        float x4 = obj.B.getX();
        float y4 = obj.B.getY();

        float denominator = (x1 - x2) * (y3 - y4)
                          - (y1 - y2) * (x3 - x4);

        if (denominator == 0) {
            return null;
        }

        float px = ((x1 * y2 - y1 * x2) * (x3 - x4)
                  - (x1 - x2) * (x3 * y4 - y3 * x4))
                  / denominator;

        float py = ((x1 * y2 - y1 * x2) * (y3 - y4)
                  - (y1 - y2) * (x3 * y4 - y3 * x4))
                  / denominator;

        return new Point(px, py);
    }


    //Overriding toString for output
    @Override
    public String toString() {
        String s = "A = " + A + "\nB = " + B;
        return s;
    }
}
