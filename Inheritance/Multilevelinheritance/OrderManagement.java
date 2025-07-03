package Multilevelinheritance;

//base class
class Order{
	int orderId;
    String OrderDate;
    public Order(int OrderId,String OrderDate) {
    	this.orderId=OrderId;
    	this.OrderDate=OrderDate;
    	
    	
    }
    
    String getOrderstatus (){
    	return "Order Placed 😊";
    	
    }
	
}

//subclass
class shippedOrder extends Order{
	int trackingNumber;
	 public shippedOrder(int OrderId,String OrderDate,int trackingNumber) {
		 super(OrderId,OrderDate);
		 this.trackingNumber=trackingNumber;
		 
		
	}
	 @Override
     String getOrderstatus(){
		 return "trackingNumber: " + trackingNumber;
		 
	 }
	 
	 
	
}

//extends subclass
class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	 public DeliveredOrder(int OrderId,String OrderDate,int trackingNumber,String deliveryDate) {
		 super(OrderId,OrderDate,trackingNumber);
		 this.deliveryDate=deliveryDate;
		 
		
	}
	 @Override
    String getOrderstatus(){
		 return "deliveryDate: " + deliveryDate;
		 
	 }
	 
	 
}

public class OrderManagement{
	public static void main(String[] args) {
		Order o1 = new Order(101, "2025-06-28");
        shippedOrder o2 = new shippedOrder(102, "2025-06-27", 999888);
        DeliveredOrder o3 = new DeliveredOrder(103, "2025-06-25", 123456, "2025-06-28");

        System.out.println(o1.getOrderstatus());
        System.out.println(o2.getOrderstatus());
        System.out.println(o3.getOrderstatus());
		
	}
	
}