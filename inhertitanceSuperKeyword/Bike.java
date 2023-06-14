package inhertitanceSuperKeyword;

public class Bike {
	private String brand;
	private int price;
	private int modelyear;
	public Bike(String brand, int price,int modelyear) {
		this.brand=brand;
		this.price=price;
		this.modelyear=modelyear;
	}
	public String toString() {
		return brand;//+" "+price+" " +modelyear;
				
		
	}
	

}
