package hashMap_collection;

public class Car {
private String brand;
private int chaseNo;
private int price;
private String color;
private String model;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getChaseNo() {
	return chaseNo;
}
public void setChaseNo(int chaseNo) {
	this.chaseNo = chaseNo;
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
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Car(String brand, int chaseNo, int price, String color, String model) {
	super();
	this.brand = brand;
	this.chaseNo = chaseNo;
	this.price = price;
	this.color = color;
	this.model = model;
}

public String toString() {
	return "Car [brand=" + brand + ", chaseNo=" + chaseNo + ", price=" + price + ", color=" + color + ", model=" + model
			+ "]";
}

}
