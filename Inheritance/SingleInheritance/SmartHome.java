package SingleInheritance;

class Devices{
	int deviceid;
	String Status;
	
	Devices(int deviceid,String Status){
		this.deviceid=deviceid;
		this.Status=Status;
		
	}
	void displayStatus() {
		System.out.println("deviceId :"+ deviceid + "\nStatus: " + Status );
		
	}
}
class Thermostat extends Devices{
	Double temperatureSetting;
	public Thermostat(int deviceid,String Status,Double temperatureSetting){
		super(deviceid,Status);
		this.temperatureSetting=temperatureSetting;;
		
		
	}
	@Override
	void displayStatus() {
		super.displayStatus();
		System.out.println("temperatureSetting :" + temperatureSetting);
		System.out.println("---------------");
	}
}
public class SmartHome {
	public static void main(String[] args) {
		Devices T1=new Thermostat(101,"Manual",20.0);
        Devices T2 = new Thermostat(102, "Energy savings", 24.0);
        Devices T3 = new Thermostat(103, "Off", null);
    
        T1.displayStatus();
        T2.displayStatus();
        T3.displayStatus();
		
		
		
	}
	

}
