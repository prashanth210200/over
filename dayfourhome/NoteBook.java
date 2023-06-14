package dayfourhome;

public class NoteBook {
	public static void main(String[] args) {
		String a=args[0];
		String[]num=a.split(",");
		String name=num[0];
		int pric=Integer.parseInt(num[1]);
		boolean rule=Boolean.parseBoolean(num[2]);
		int pag=Integer.parseInt(num[3]);
		int discount=Integer.parseInt(num[4]);
		int netprice= pric-( pric * discount);
		System.out.println("Brand "+ num[0].toUpperCase());
		System.out.println("netprice"+ netprice);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}	
	
	
	
	class Usenote {
		String brand;
		int price;
		boolean isruled;
		int pages;
		int discountpercentage;
		int netprice;
		
		
	
}


