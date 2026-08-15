public class Point {
    private float x;
    private float y;


    //Null Constructor created 1st 
    Point() {
        x = 0;
        y = 0;
    }

    //Parameterized Constructor Created 
    Point(float pointA, float pointB) {
        this.x = pointA;
        this.y = pointB;
    }

    //Copy Constructor Created 
    Point(Point obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    //add Point fuction or method Created 
    public Point addPoints(Point obj) {
        float x = this.x + obj.x;
        float y = this.y + obj.y;
        return new Point(x, y);
    }

    //subtraction function or method created here
    public Point subtractPoints(Point obj) {
        float x = this.x - obj.x;
        float y = this.y - obj.y;
        return new Point(x, y);
    }

    //setter 
    public void setX(float x) {
        this.x = x;
    }

    //Setter
    public void setY(float y) {
        this.y = y;
    }

    //SETTER
    public void setValue(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //getter
    public float getX() {
        return x;
    }

    //getter
    public float getY() {
        return y;
    }

    //getter
    public Point getValue() {
        return new Point(this.x, this.y);
    }

    //overriding toString for output
    @Override
    public String toString() {
        String s = "( " + this.x + " , " + this.y + " )";
        return s;
    }
}
