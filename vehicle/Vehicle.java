package vehicle;

public class Vehicle implements IVehicle{

    // Variables
    private String model;
    private String make;
    private String year;
    private int speed;

    // Constructors
    public Vehicle(String model, String make, String year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public Vehicle() {

    }

    // Getters Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("Vehicle started vrooom vroooooom vroooooom...");
    }

    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Vehicle has stoppped...");
    }

    @Override
    public void acclerate(int increment) {
        this.speed = this.speed + increment;
    }

    @Override
    public void brake(int decrement) {
        this.speed = this.speed - decrement;
    }

    @Override
    public void honk() {
        System.out.println("Hong hong hong hong hong hong, now hit the claxon!");
    }

}
