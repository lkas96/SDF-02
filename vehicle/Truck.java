package vehicle;

public class Truck extends Vehicle {

    // Variables
    private double cargoCapacity;

    public Truck(String model, String make, String year, double cargoCapacity) {
        super(model, make, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // OVERRIDING INTERFACES

    @Override
    public void start() {
        System.out.println("Truck went brrrrraaaah braaaah bbbbrrrrrrr...");
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        System.out.println("Truck no speed, truck no move, truck has stoppped...");
    }

    @Override
    public void acclerate(int increment) {
        this.setSpeed(this.getSpeed() + increment + 10);
    }

    // Same as parent class, so dont need to touch this
    // @Override
    // public void brake(int decrement) {
    // this.speed = this.speed - decrement;
    // }

    @Override
    public void honk() {
        System.out.println("Truck has hit the claxon!");
    }

}
