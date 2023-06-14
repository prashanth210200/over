package inhertitance;

public class StationaryProduct {
	String brand;
	int price;
	String ledSize;
	public int findNetprice(int tax) {
		return price+(price*tax/100);
	}

}
