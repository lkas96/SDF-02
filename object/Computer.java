package object;

public class Computer{
    
    //Declare variables
    private String cpu;
    private String model;
    private String yearMade;
    private int ram;
    private int storage;


    //class object can be instantiated with default values
    //Using with constructor class
    public Computer(String cpu, String model, String yearMade, int ram, int storage) {
        this.cpu = cpu;             //this keyword is a variable
        this.model = model;         //refers to class level variable
        this.yearMade = yearMade;   //parameters passed in are the same name
        this.ram = ram;             //hence using this to differentiate
        this.storage = storage;     //if different name, can skip the this keyword but might be more confusing
    }

    public Computer(){
        this.cpu = "Intel XEON 5GHZ";
        this.model = "Jiafei Computer 7th gen";
        this.yearMade = "2024";
        this.ram = 69;
        this.storage = 420;
    }


    //getters and setters
    //generated automatically with vsc
    public String getCpu() {
        return cpu;
    }


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getYearMade() {
        return yearMade;
    }


    public void setYearMade(String yearMade) {
        this.yearMade = yearMade;
    }


    public int getRam() {
        return ram;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }


    public int getStorage() {
        return storage;
    }


    public void setStorage(int storage) {
        this.storage = storage;
    }


    //FUNCTIONS or behaviours
    public String whatCpu(){
        return getCpu();
    }

    public String whatModel(){
        return getModel();
    }

    public String whatYearMade(){
        return getYearMade();
    }

    public void getSpecs(){
        System.out.println(getCpu());
        System.out.println(getModel());
        System.out.println(getYearMade());
        System.out.println(getRam());
        System.out.println(getStorage());
    }

    public void startUp(){
        System.out.println("Computer has booted.");
    }

    public void shutdown(){
        System.out.println("Computer is shutting down byeeeee.");
    }
    

}