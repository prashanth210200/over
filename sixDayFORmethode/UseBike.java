package sixDayFORmethode;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="honda";
		bike1.price=201220;
		bike1.discountAmount=2000;
		bike1.netPrice=bike1.getnetPrice();
		bike1.display();
	
		
	Bike bike2=new Bike();
	bike2.brand= "TVS";
	bike2.price=303030;
	bike2.discountAmount=1000;
	bike2.netPrice=bike2.getnetPrice();
	//System.out.println(bike2.netPrice);
	bike2.display();
	

	Bike bike3=new Bike();
	bike3.brand="YAMAHA";
	bike3.price=589654;
	bike3.discountAmount=2000;
	bike3.netPrice=bike3.getnetPrice();
	//System.out.println(bike3.netPrice);
	bike3.display();

	Bike[]bikes= {bike1,bike2,bike3};
	System.out.println(bike1.findtotalprice(bikes));
	Bike maxBike=bike1.getCostlyBike(bikes);
	maxBike.display();
	}
}
