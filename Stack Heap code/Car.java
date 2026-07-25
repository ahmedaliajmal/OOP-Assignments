public class Car {
   
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;

    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        this.engineOn = true;
        System.out.println(this.brand + " engine started.");
    }

    public void stopEngine() {
        this.speed = 0;
        this.engineOn = false;
        System.out.println(this.brand + " engine stopped.");
    }

    public void displayState() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Color : " + this.color);
        System.out.println("Speed : " + this.speed + " km/h");
        System.out.println("Engine on: " + this.engineOn);
        System.out.println();
    }
}