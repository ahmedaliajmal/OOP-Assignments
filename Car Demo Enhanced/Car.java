public class Car {

    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;   
    private int gear;           

    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100.0;
        this.gear = 0;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        if (this.fuelLevel <= 0) {
            System.out.println(this.brand + " cannot start: no fuel.");
            return;
        }
        this.engineOn = true;
        this.gear = 1;
        System.out.println(this.brand + " engine started.");
    }

    public void stopEngine() {
        this.engineOn = false;
        this.speed = 0;     
        this.gear = 0;
        System.out.println(this.brand + " engine stopped.");
    }



    public void drive() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot drive: engine is off.");
            return;
        }
        this.speed = 20;
        consumeFuel(2.0);
        System.out.println(this.brand + " is driving at " + this.speed + " km/h.");
    }

    public void moveFast() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot accelerate: engine is off.");
            return;
        }
        this.speed += 30;
        consumeFuel(4.0);
        System.out.println(this.brand + " sped up to " + this.speed + " km/h.");
    }

    public void moveSlow() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot slow down: engine is off.");
            return;
        }
        this.speed = Math.max(0, this.speed - 15); // rule: speed never negative
        System.out.println(this.brand + " slowed to " + this.speed + " km/h.");
    }

    public void moveLeft() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot turn: engine is off.");
            return;
        }
        System.out.println(this.brand + " is turning left.");
    }

    public void moveRight() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot turn: engine is off.");
            return;
        }
        System.out.println(this.brand + " is turning right.");
    }


    public void horn() {
        System.out.println(this.brand + " honks: Beep! Beep!");
    }


    private void consumeFuel(double amount) {
        this.fuelLevel = Math.max(0, this.fuelLevel - amount);
        if (this.fuelLevel == 0) {
            System.out.println(this.brand + " is out of fuel!");
            stopEngine();
        }
    }

    public void displayState() {
        System.out.println("---- " + this.brand + " State ----");
        System.out.println("Color     : " + this.color);
        System.out.println("Speed     : " + this.speed + " km/h");
        System.out.println("Gear      : " + this.gear);
        System.out.println("Engine on : " + this.engineOn);
        System.out.println("Fuel level: " + this.fuelLevel);
        System.out.println("----------------------------");
    }
}