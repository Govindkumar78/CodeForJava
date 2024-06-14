package june12HierarchicalInheritance;

class Refrigerator extends Appliance {
    private int capacity;
    private int temperature;

    public Refrigerator(String brand, int powerConsumption, int capacity) {
        super(brand, powerConsumption);
        this.capacity = capacity;
        this.temperature = 4; // Default temperature for a refrigerator
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void displayTemperature() {
        System.out.println("Temperature: " + temperature + "°C");
    }
}
