public class RationalNum {
    private double numerator;
    private double denominator;
    

    //Defualt Constructor (denominator Cannot Be Zero)
    RationalNum(){
        this.numerator = 0;
        this.denominator = 1;
    }

    //Parameterized Constructor
    RationalNum(double numerator, double denominator){
        if(denominator == 0){
            throw new ArithmeticException("Denominator Cannot Be Zero");
        }
        else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }


    //Adding two Rational number a/b + c/d = (ad + bc)/bd
    public RationalNum add(RationalNum obj){
        double x = (this.numerator*obj.denominator)+(this.denominator*obj.numerator);
        double y = (this.denominator*obj.denominator);
        

        return new RationalNum(x,y);
    }


    //Subtracting Two Rational Numbers a/b-c/d = (ad-bc)/bd
    public RationalNum sub(RationalNum obj){
        double x = (this.numerator*obj.denominator)-(this.denominator*obj.numerator);
        double y = (this.denominator*obj.denominator);
        

        return new RationalNum(x,y);
    }

    //Multiplying Two Rational Numbers a/b*c/d = a*c/b*d
    public RationalNum mult(RationalNum obj){
        double x = (this.numerator*obj.numerator);
        double y = (this.denominator*obj.denominator);
        

        return new RationalNum(x,y);
    }

    //Dividing Two Rational Numbers
    public RationalNum divide(RationalNum other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero rational number.");
        }
        double num = this.numerator * other.denominator;
        double den = this.denominator * other.numerator;
        return new RationalNum(num, den);
    }

    // String representation
    @Override
    public String toString() {
        if (this.numerator == 0) {
            return "0";
        } else if (this.denominator == 1) {
            return String.valueOf(this.numerator);
        } else {
            return this.numerator + " / " + this.denominator;
        }
    }

    //Copy Constructor Creation
    RationalNum(RationalNum obj){
        this.numerator = obj.numerator;
        this.denominator = obj.denominator;
    }
}
