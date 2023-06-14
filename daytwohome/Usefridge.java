package daytwohome;

public class Usefridge {
	public static void main(String[] args) {
		Fridge fridge1=new Fridge();
		fridge1.brand="lg";
		fridge1.price=20000;
		fridge1.model=2023;
		fridge1.color="red";
		fridge1.isdoubledoor=true;
		fridge1.taxpercentage=15;
		fridge1.discountpercentage=20;
		fridge1.discountamount=20;
		fridge1.netprice=25000;
		fridge1.taxamount=fridge1.price*(fridge1.taxpercentage/100);
		fridge1.discountamount=fridge1.price*fridge1.discountpercentage/100;
		fridge1.netprice=fridge1.price+fridge1.taxamount-fridge1.discountamount;
		
		System.out.println("netprice="+fridge1.netprice+" taxamountis="+fridge1.taxamount);
				
		
		
		
		
	}

}
