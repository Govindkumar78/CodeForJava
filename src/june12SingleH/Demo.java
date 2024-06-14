package june12SingleH;

public class Demo {
	public static void main(String[] args) {
		
		
		SmartPhone d  = new SmartPhone();
		d.brand = "samsung" ;
		d.model = "s23" ;
		d.operatingSystem = "AOX" ;
		d.cameraResolution = "500px" ;
		
		d.display();
		d.powerOff();
		d.powerOn(); 
		d.takePhoto();
			
		}

	}

