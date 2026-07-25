    public class Main {
        public static void main(String[] args) {

            Car myCar = new Car();

            myCar.displayState();

            myCar.setDetails("Toyota", "Red");

            myCar.startEngine();

            myCar.displayState();

            myCar.stopEngine();

            myCar.displayState();
        }
    }