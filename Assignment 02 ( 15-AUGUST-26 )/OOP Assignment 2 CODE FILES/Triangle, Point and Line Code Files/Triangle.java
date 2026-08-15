public class Triangle {
    private Line AB;
    private Line BC;
    private Line CA;

    //Defualt Constructor
    Triangle() {
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();

        this.AB = new Line(A, B);
        this.BC = new Line(B, C);
        this.CA = new Line(C, A);
    }


    //Parameterized Constructor
    Triangle(Line AB, Line BC, Line CA) {
        this.AB = new Line(AB);
        this.BC = new Line(BC);
        this.CA = new Line(CA);
    }


    //Copy Constructor
    Triangle(Triangle obj) {
        this.AB = new Line(obj.AB);
        this.BC = new Line(obj.BC);
        this.CA = new Line(obj.CA);
    }

    //setters starts
    public void setAB(Line AB) {
        this.AB = new Line(AB);
    }

    public void setBC(Line BC) {
        this.BC = new Line(BC);
    }

    public void setCA(Line CA) {
        this.CA = new Line(CA);
    }

    public void setLines(Line AB, Line BC, Line CA) {
        this.AB = new Line(AB);
        this.BC = new Line(BC);
        this.CA = new Line(CA);
    }


    //getters starts
    public Line getAB() {
        return new Line(AB);
    }

    public Line getBC() {
        return new Line(BC);
    }

    public Line getCA() {
        return new Line(CA);
    }


    //Overriding toString for output
    @Override
    public String toString() {
        String s = "AB:\n" + AB +
                   "\n\nBC:\n" + BC +
                   "\n\nCA:\n" + CA;
        return s;
    }
}