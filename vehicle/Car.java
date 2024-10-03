package vehicle;

public class Car extends Vehicle {
    
    //Variables
    public String carType;
    public int numOfPassengers;

    //Constructors
    public Car(String model, String make, String year, String carType, int numOfPassengers) {
        super(model, make, year);
        this.carType = carType;
        this.numOfPassengers = numOfPassengers;
    }

    public Car(String carType, int numOfPassengers) {
        this.carType = carType;
        this.numOfPassengers = numOfPassengers;
    }

    //Getters Setters
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    //OVERRIDING INTERFACES
    
    @Override
    public void start() {
        System.out.println("Car started vrooom vroooooom vroooooom...");
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        System.out.println("Car has stoppped...");
    }

    @Override
    public void acclerate(int increment) {
        this.setSpeed(this.getSpeed() + increment + 10);
    }

    //Same as parent class, so dont need to touch this
    // @Override
    // public void brake(int decrement) {
    //     this.speed = this.speed - decrement;
    // }

    @Override
    public void honk() {
        System.out.println("Car says : Hong hong hong hong hong hong, now hit the claxon!");
    }

    
    
}
