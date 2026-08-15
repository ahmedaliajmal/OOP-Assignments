public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        Car tesla = new Car();

        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        bmw.drive();

        bmw.startEngine();
        tesla.startEngine();

        bmw.drive();
        bmw.moveFast();
        bmw.moveLeft();
        bmw.horn();

        tesla.drive();
        tesla.moveRight();

        bmw.displayState();
        tesla.displayState();

        bmw.moveSlow();
        bmw.stopEngine();
        bmw.displayState();


        tesla.displayState();
    }
}