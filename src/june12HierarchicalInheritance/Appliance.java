package june12HierarchicalInheritance;

public class Appliance {
	
	    protected String brand;
	    protected int powerConsumption;
	    protected boolean isOn;

	    public Appliance(String brand, int powerConsumption) {
	        this.brand = brand;
	        this.powerConsumption = powerConsumption;
	        this.isOn = false;
	    }

	    public void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Power Consumption: " + powerConsumption + " watts");
	        System.out.println("Status: " + (isOn ? "On" : "Off"));
	    }

	    public void turnOn() {
	        isOn = true;
	        System.out.println("The " + brand + " is now turned on.");
	    }

	    public void turnOff() {
	        isOn = false;
	        System.out.println("The " + brand + " is now turned off.");
	    }
	}

