package oopsencapsulation;

public class Laptop {
	private String brand;
	private int price;
	private Display dis;
public void  setbrand(String brand) {
	this.brand=brand;
}
public String getbrand() {
	return brand;
	
}
public void setprice(int price) {
	this.price=price;
	
}
public int getprice() {
	return price;
}
public void setdis(Display dis) {
	this.dis=dis;
	
}
public Display getdis() {
	return dis;
}
}

