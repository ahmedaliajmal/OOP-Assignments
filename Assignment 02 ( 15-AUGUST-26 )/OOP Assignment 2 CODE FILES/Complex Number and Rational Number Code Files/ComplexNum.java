public class ComplexNum {
    private double real;
    private double img;

    //Default Constructor
    ComplexNum(){
        this.real = 0;
        this.img = 0;
    }

    //Parameterized Constructor
    ComplexNum(double real ,double img){
        this.real = real;
        this.img = img;

    }

    //Copy Constructor
    ComplexNum(ComplexNum obj){
        this.real = obj.real;
        this.img = obj.img;

    }

    //Complex Number addition (a,bi)+(c,di)= (a+c,(b+d)i)
    public ComplexNum addComplexNum(ComplexNum obj){
        double x = this.real + obj.real;
        double y = this.img + obj.img;
        return new ComplexNum(x,y);
    }

    //Complex Number Subtraction (a,bi)-(c,di) = (a-c,(b-d)i)
    public ComplexNum subComplexNum(ComplexNum obj){
        double x = this.real - obj.real;
        double y = this.img - obj.img;
        return new ComplexNum(x,y);
    }

    //Multiply two Complex Numbers
    //a+bi * c+di = (ac - bd) + (ad +bc)i
    public ComplexNum multComplexNum(ComplexNum obj){
        double x = (this.real * obj.real)-(this.img * obj.img);
        double y = (this.real * obj.img)  + (this.img * obj.real);
        return new ComplexNum(x, y);
    }

    @Override
    //overriding ComplexNum to Print Results in String Format using toString()
    public String toString(){
        String s = "( "+ this.real+ " , "+ this.img+" )";
        return s;
    }


}
