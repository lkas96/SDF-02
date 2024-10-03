package object;

public class Desktop extends Computer {
    
    private String operatingSystem;
    private int weight;
    private Boolean watercooling;


    
    public Desktop(String cpu, String model, String yearMade, int ram, int storage, String operatingSystem, int weight,
            Boolean watercooling) {
        super(cpu, model, yearMade, ram, storage);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.watercooling = watercooling;
    }

    
    
    public Desktop(String operatingSystem, int weight, Boolean watercooling) {
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.watercooling = watercooling;
    }


    public Desktop() {
    }

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
    public Boolean getWatercooling() {
        return watercooling;
    }
    public void setWatercooling(Boolean watercooling) {
        this.watercooling = watercooling;
    }


    //override functions
    @Override
    public void getSpecs(){
        System.out.println("This desktop details are : ");
        System.out.println(this.getModel());
        System.out.println(this.getYearMade());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getStorage());
        System.out.println(this.getWatercooling());
        System.out.println(this.getWeight());
        System.out.println("This system is watercooled? : " + this.getOperatingSystem());
    }
    
}
