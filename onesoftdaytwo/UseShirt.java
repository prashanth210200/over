package onesoftdaytwo;

public class UseShirt {
	public static void main(String[] args) {
	
	Shirt shirt1 =new Shirt();
	shirt1.brand="Rolex";
	shirt1.price=450;
	shirt1.color="red";
	shirt1.size=32;
	shirt1. ischecked=true;
	shirt1.discount=25;
	shirt1.netprice= shirt1.price-(shirt1.price * shirt1.discount/100);
	Shirt shirt2 =new Shirt();
	shirt2.brand="Rol";
	shirt2.price=550;
	shirt2.color="red";
	shirt2.size=33;
	shirt2. ischecked=false;
	shirt2.discount=35;
	shirt2.netprice= shirt1.price-(shirt1.price * shirt1.discount/100);
	System.out.println("Brand name is ="+shirt1.brand+"  netprice is= "+shirt1.netprice);
	
	}

}
