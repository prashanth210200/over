package objectCreation;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		//Vehicle v=new Vehicle();
		Vehicle v1=new Car();
		Bike b=new Bike();
		System.out.println(v1.findCc());
	}

}
