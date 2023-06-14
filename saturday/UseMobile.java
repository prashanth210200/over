package saturday;
public class UseMobile {
	public static void main(String[]args) {
	    String  a=args[0];
	    String b=args[1];
	    String c=args[2];
		Mobile mobile1=new Mobile();
		mobile1.price=Integer.parseInt(a);
		mobile1.brand=b;
		mobile1.model=c;	
		System.out.println("Price= "+Integer.parseInt(a));
	}

}
class Mobile {
	int price;
	String brand;
	String model;
}