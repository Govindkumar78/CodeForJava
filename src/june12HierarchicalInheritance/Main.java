package june12HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("Samsung", 200, 500);
        Oven oven = new Oven("LG", 1500, 250);

        fridge.turnOn();
        fridge.turnOff();
        System.out.println();
        
        oven.turnOn();
        oven.turnOff();
        System.out.println();

       
        fridge.displayInfo();
        System.out.println();
        oven.displayInfo();
        System.out.println();

      
        fridge.setTemperature(2);
        oven.setTemperature(200);
        fridge.displayTemperature();
        oven.displayTemperature();
    }
}
