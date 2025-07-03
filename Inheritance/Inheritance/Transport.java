package Inheritance;

 class Vehicles {
	String fuelType;
	Double maxSpeed;
	
	public Vehicles(String fuelType , Double maxSpeed){
		this.fuelType=fuelType;
		this.maxSpeed=maxSpeed;
		
	}
	
	void displayInfo() {
		System.out.println("speed:" + maxSpeed + "km/h , fuel: "+ fuelType);
	}

}

class Car extends  Vehicles{
	int seatCapacity;
	public Car(Double maxSpeed, String fuelType, int seatCapacity) {
		super(fuelType,maxSpeed);
		this.seatCapacity=seatCapacity;
	}
	@Override 
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("CarCapacity :" + seatCapacity);
	}
}

class Truck extends  Vehicles{
	double truckLoad;
	public Truck (Double maxSpeed, String fuelType, double truckLoad) {
		super(fuelType,maxSpeed);
		this.truckLoad=truckLoad;
	}
	@Override 
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Truck Load Capacity : " + truckLoad);

	}
}
class Motorcycle  extends  Vehicles{
	boolean hasGear;
	public Motorcycle(Double maxSpeed, String fuelType, boolean hasGear) {
		super(fuelType,maxSpeed);
		this.hasGear=hasGear;
	}
	@Override 
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("gear in motorcyle :" + hasGear);

	}
}

public class Transport{
	public static void main(String[]args) {
		Vehicles[] vehicles = new Vehicles[3];
		vehicles[0]= new Car(180.0,"CNG",5);
		vehicles[1]= new Truck(120.0,"diesel",10);
		vehicles[2]= new Motorcycle(90.0,"Petrol",true);
		
		for(Vehicles t:vehicles) {
			t.displayInfo();
			System.out.println("--------");
		}
		
		


		
		

	}
}
