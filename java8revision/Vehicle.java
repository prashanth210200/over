package java8revision;

public class Vehicle {
	public static void main(String []args) {
//		Bike p=(x)->{
//			if(x>2000) {
//			return "high value";
//			}
//			else {
//				return"low value";
//			}
//		};
//		
//		System.out.println(p.getprice(9000, 0));
	Bike b = (a,c)->a+c;
         System.out.println(b.getprice(100, 200));
}
}

