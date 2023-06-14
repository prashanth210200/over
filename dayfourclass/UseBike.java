package dayfourclass;

public class UseBike {
	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		String[]name1=a.split(",");
		String[]name2=b.split(",");
		Bike bike1=new Bike();
		bike1.brand=name1[0];
		bike1.price=Integer.parseInt(name1[1]);
		bike1.color=name1[2];
		bike1.ispetrol=Boolean.parseBoolean(name1[3]);
		
		
		Bike bike2=new Bike();
		bike2.brand=name2[0];
		bike2.price=Integer.parseInt(name2[1]);
		bike2.color=name2[2];
		bike2.ispetrol=Boolean.parseBoolean(name2[3]);
		System.out.println("brand: "+bike1.brand+"   Price: "+bike1.price);
		System.out.println("brand: "+bike2.brand+"   Price: "+bike2.price);
		
	}

}


 class Bike {
	String brand;
	int price;
	String color;
	boolean ispetrol;
	
}