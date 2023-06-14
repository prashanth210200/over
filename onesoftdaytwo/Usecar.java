package onesoftdaytwo;

public class Usecar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1. brand="benz";
		car1.price=100000;
		car1.model=2023;
		car1.istubeless=true;
		car1.taxamount=2500;
		car1.netprice=car1.price+car1.taxamount;
		
		Car car2=new Car();
		car2. brand="aadi";
		car2.price=200000;
		car2.model=2023;
		car2.istubeless=true;
		car2.taxamount=2500;
		car2.netprice=car2.price+car2.taxamount;
		System.out.println("netprice="+car2.netprice);
		System.out.println("netprice="+car1.netprice);
	}

}
