package onesoftdaytwo;

public class Uselaptop {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="hp";
		laptop1.price=101010;
		laptop1.istouchscreen=false;
		laptop1.color="red";
		laptop1.ram=8;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="dell";
		laptop2.price=212121;
		laptop2.istouchscreen=true;
		laptop2.color="blue";
		
		Laptop laptop3=new Laptop();
		laptop3.brand="shell";
		laptop3.price=313131;
		laptop3.istouchscreen=false;
		laptop3.ram=6;
		laptop3.color="black";
		System.out.println("brand="+laptop1.brand+" price="+laptop1.price+" istouchscreen="+laptop1.istouchscreen+" color="+laptop1.color+" ram="+laptop1.ram);
		
	}

}
