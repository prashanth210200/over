package saturday;

public class UseChair {
	public static void main(String[] args) {
		String []a=args;
		String b=a[0];
		String c=a[1];
		String d=a[2];
		Chair chair=new Chair();
		chair.brand=b;
		chair.withHand=Boolean.parseBoolean(c);
		chair.price=Integer.parseInt(d);
		
		System.out.print(chair.brand);
		
		
		
		
		
		
	}

}
class Chair{
	String brand;
	boolean withHand;
	int price;
}