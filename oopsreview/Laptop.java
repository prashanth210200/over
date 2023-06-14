package oopsreview;

import java.util.Arrays;

public class Laptop {
	private String brand;
	private Amd amd;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Amd getAmd() {
		return amd;
	}
	public void setAmd(Amd amd) {
		this.amd = amd;
	}
	public KeyBoard[] getKey() {
		return key;
	}
	public void setKey(KeyBoard[] key) {
		this.key = key;
	}
	private KeyBoard[] key;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", amd=" + amd + ", key=" + Arrays.toString(key) + "]";
	}
	
}
