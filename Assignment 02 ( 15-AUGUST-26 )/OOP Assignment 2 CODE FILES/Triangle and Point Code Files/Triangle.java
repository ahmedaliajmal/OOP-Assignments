public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    //Null Constructor 
    Triangle(){
        this.A = new Point();
        this.B = new Point();
        this.C = new Point();
    }

    //Parameterized Constructor
    Triangle(Point x, Point y, Point z){
        this.A = x;
        this.B = y;
        this.C = z;
    }

    //CopyConstructor
    Triangle(Triangle obj){
        this.A = obj.A;
        this.B = obj.B;
        this.C = obj.C;
    }

    @Override
    public String toString(){
        String s = "A = " + A + "\nB = "+B+ "\nC = "+C;
        return s;
    }    

    
}
