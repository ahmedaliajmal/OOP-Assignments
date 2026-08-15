class Point{
    private float x;
    private float y;

    Point(){
        x = 0;
        y = 0;

    }

    Point(float pointA, float pointB){
        this.x = pointA;
        this.y = pointB;
    }

    public Point addPoints(Point obj){
        float x = this.x + obj.x;
        float y = this.y + obj.y;
        return new Point(x,y);
    }

    public Point subtractPoints(Point obj){
        float x = this.x - obj.x;
        float y = this.y - obj.y;
        return new Point(x,y);
    }

    public void setValue(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point getValue(){
        return new Point(this.x , this.y);
    }



    Point(Point obj){
        this.x = obj.x;
        this.y = obj.y;
    }

    @Override
    public String toString(){
        String s = "( "+ this.x + " , "+this.y+" )";
        return s;
    }

}