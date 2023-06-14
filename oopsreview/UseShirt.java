package oopsreview;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt();
		s1.brand="polo";
		s1.price=1500;
		s1.color="white";
		s1.size=36;
		
		Shirt s2=new Shirt();
		s2.brand="Alex";
		s2.price=1690;
		s2.color="yellow";
		s2.size=34;
	
		Shirt s3=new Shirt();
		s3.brand="alex";
		s3.price=2500;
		s3.color="red";
		
		
				Shirt[] shirts= {s1,s2,s3};
             int temp=shirts[0].Price;
             for(Shirt x:shirts) {
            	 if(x.price<temp) {
            		 temp=x.price;	 
             }
             }
             System.out.println("the mini Price"+temp);
             try {
            	 if(temp<2000) {
            		 throw new PriceException(("costly"));
            	 }
            	 else {
            		 System.out.println("affortable price");
            	 }
             }
             catch(PriceException p) {
            	 System.out.println("error occurs");
             }
	}
	
}
