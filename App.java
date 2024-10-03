
import java.util.ArrayList;
import java.util.List;

import object.Computer;
import object.Desktop;
import object.Laptop;

public class App {

    public static void main(String[] args) {

        Computer computer = new Computer(); // Instantiate blank computer no assigned parameters
        computer.setCpu("Dual Core 7th Gen i5120"); // Manually assign the different parameters/specs
        computer.setModel("Dell XPS 7th");
        computer.setRam(16);
        computer.setStorage(1);
        computer.setYearMade("2004");

        computer.startUp(); // Run functoins
        computer.getSpecs();
        computer.shutdown();
        System.out.println("----------End of Computer1----------");
        System.out.println("");

        Computer computer2 = new Computer(); // Instantiate a new computer
        computer2.startUp(); // SHould use a default constructor
        computer2.getSpecs(); // Show default values in the constructor
        computer2.shutdown();
        System.out.println("----------End of Computer2----------");
        System.out.println("");

        Laptop laptop1 = new Laptop();
        laptop1.setCpu("1.2Ghz");
        laptop1.setModel("Dore 2 duo Asus");
        laptop1.setRam(2);
        laptop1.setStorage(2);
        laptop1.setOperatingSystem("Windows 11");
        laptop1.setScreenSize("15.6 Inches");
        laptop1.setWeight(3);
        laptop1.setBatteryCapacity("5600mah");
        laptop1.setYearMade("2024 July");
        laptop1.startUp(); // SHould use a default constructor
        laptop1.getSpecs(); // Show default values in the constructor
        laptop1.shutdown();
        System.out.println("----------End of laptop1----------");
        System.out.println("");

        Desktop desktop1 = new Desktop();
        desktop1.setCpu("7.6Ghz");
        desktop1.setModel("AMD BRAZEN");
        desktop1.setRam(24);
        desktop1.setStorage(200);
        desktop1.setOperatingSystem("Windows Jiafei Desktop");
        desktop1.setWeight(8);
        desktop1.setWatercooling(true);
        desktop1.setYearMade("2024 September");
        System.out.println("----------End of desktop1----------");
        System.out.println("");

        Desktop desktop2 = new Desktop("20ghz", "Apple", "2024 December", 32, 16, "High Sierra", 69, true);
        desktop2.startUp();
        desktop2.getSpecs();
        desktop2.shutdown();
        System.out.println("----------End of desktop2----------");
        System.out.println("");

        List<Computer> machines = new ArrayList<>();
        machines.add(desktop1);
        machines.add(desktop2);
        machines.add(laptop1);

        System.out.println("List of computers available: ");
        for (int i = 0; i < machines.size(); i++) {
            System.out.println(machines.get(i));
            System.out.println("");
        }

    }
}
