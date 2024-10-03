package object;

public class Laptop extends Computer {
    
    //additional variables
    private String operatingSystem;
    private int weight;
    private String batteryCapacity;
    private String screenSize;

    //getters and setters
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    //CONSTRUCTORS
    public Laptop(String cpu, String model, String yearMade, int ram, int storage) {
        super(cpu, model, yearMade, ram, storage);
    }

    public Laptop(String cpu, String model, String yearMade, int ram, int storage, String operatingSystem, int weight,
            String batteryCapacity, String screenSize) {
        super(cpu, model, yearMade, ram, storage);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
    }

    public Laptop(){

    }


    //OVERRING FUNCTIONS
    @Override
    public void startUp(){
        System.out.println("Laptop has booted up.");
    }

    @Override
    public void shutdown(){
        System.out.println("Laptop is shutting down");
    }

    @Override
    public void getSpecs(){
        System.out.println("This laptop details are : ");
        System.out.println(this.getModel());
        System.out.println(this.getYearMade());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getStorage());
        System.out.println(this.getBatteryCapacity());
        System.out.println(this.getOperatingSystem());
        System.out.println(this.getWeight());
    }


    
    
}
