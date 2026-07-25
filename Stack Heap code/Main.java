public class Main {
    public static void main(String[] args) {

        // Declaration + instantiation:
        // "Car bmw" declares a reference variable  before "new Car()" runs,
        // it would hold null (it points to nothing).
        // "new Car()" creates the actual object on the heap and returns
        // its address, which is then stored in bmw.
        Car bmw = new Car();

        // tesla is a completely separate reference, pointing to its own
        // separate Car object on the heap not the same object as bmw.
        Car tesla = new Car();

        // Each call uses the dot operator to send a message to the object
        // that the reference points to. bmw and tesla change independently.
        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        bmw.startEngine();
        tesla.startEngine();

        // At this point, speed is still 0 for both objects, since
        // startEngine() only changes engineOn, not speed.
        bmw.displayState();
        tesla.displayState();

        // Only bmw's object is modified here tesla's object on the
        // heap is untouched, proving the two objects are independent.
        bmw.stopEngine();
        bmw.displayState();
    }
}