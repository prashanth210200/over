package inhertitance;

public class Car {
	String brand;
	int price;
	public int findnetprice(int tax) {
		return price+(price*tax/100);
	}

}
