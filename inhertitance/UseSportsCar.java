package inhertitance;

public class UseSportsCar {
	public static void main(String[] args) {
		SportsCar sc=new SportsCar();
		sc.brand="YAMAHA";
		sc.price=1200000;
		sc.speed=123;
		sc.model="SPORTS";
		System.out.println(sc.findnetprice(10));
		
	}

}
