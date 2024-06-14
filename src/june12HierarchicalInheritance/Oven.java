package june12HierarchicalInheritance;

public class Oven extends Appliance {
	 private int maxTemperature;
	    private int temperature;

	    public Oven(String brand, int powerConsumption, int maxTemperature) {
	        super(brand, powerConsumption);
	        this.maxTemperature = maxTemperature;
	        this.temperature = 0; // Default temperature for an oven
	    }

	    public void setTemperature(int temperature) {
	        if (temperature <= maxTemperature) {
	            this.temperature = temperature;
	        } else {
	            System.out.println("Error: Temperature exceeds the maximum temperature of the oven.");
	        }
	    }

	    public void displayTemperature() {
	        System.out.println("Temperature: " + temperature + "°C");
	    }
	}


