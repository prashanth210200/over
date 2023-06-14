package java8_default;

public interface Fruit {
	public String color (String color);
	public int price(int price);
	public default float weigth(float weight) {
		return weight;
	
	}

}
