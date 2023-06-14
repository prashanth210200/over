package sixDayFORmethode;

public class Bike {
	String brand;
	int price;
	int discountAmount;
	int netPrice;

	public int getnetPrice() {
		return price - discountAmount;

	}

	public void display() {
		System.out.println(brand + " " + price + " " + discountAmount + " " + netPrice);
	}

	public int findtotalprice(Bike[] b) {
		int totalprice = 0;
		for (int i = 0; i < b.length; i++) {
			totalprice = totalprice + b[i].price;
		}
		return totalprice;
	}

	public Bike getCostlyBike(Bike[] bikes) {
		Bike max = bikes[0];
		for (int i = 0; i <= bikes.length - 1; i++) {
			if (bikes[i].netPrice <= max.netPrice) {
				max = bikes[i];

			}
		}
		return max;
	}
}