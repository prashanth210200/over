package fibonacciSeries;

import java.util.List;

public class Car {
	String name;
	int price;
	String color;
	int enginecc;
public void findWhiteCar(List<Car> cars) { 
	for(Car car : cars ) {
		if (car.getColor().equalsIgnoreCase("white")) {
			System.out.println(getName() + " " + getPrice());
		} 
	}
		
		System.out.println( "no cars");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	
	public Car(String name, int price, String color, int enginecc) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.enginecc = enginecc;
	}
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", color=" + color + ", enginecc=" + enginecc;
	}
	

}
