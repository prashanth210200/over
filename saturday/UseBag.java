package saturday;

public class UseBag {
	public static void main(String[] args) {
		String a=args[0];
		String [] b=a.split(",");
		String c=b[0];
		String d=b[1];
		String e=b[2];
		Bag bag=new Bag();
		bag.brand=c;
		String f=c.toUpperCase();
		bag.price=Integer.parseInt(d);
		bag.iswarranty=Boolean.parseBoolean(e);
		System.out.println("BRAND="+f);
		

		
		
		
		
	}

}
class Bag {
	String brand;
	int price;  
	boolean iswarranty;
}