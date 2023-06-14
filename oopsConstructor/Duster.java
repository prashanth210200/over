package oopsConstructor;

import oopsencapsulation.Compressor;

public class Duster {
private String brand;
private int price;
private Duster dus;

public void setBrand(String brand) {
	this.brand=brand;
}
	public String getBrand() {
		return brand;
	}
	
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setdus(Duster dus) {
	this.dus=dus;
}
public Duster getdus() {
	return dus;
}
	
}



