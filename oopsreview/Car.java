package oopsreview;

import java.util.Arrays;

public class Car {
	private int price;
	private String brand;
	private String model;
	private String color;
	private Engine engine;
	private Tyre[] tyres;
	
	
	public void setprice(int price) {
	 this.price= price;
	}
	public int getprice() {
			return price;
	}
	public void setbrand(String brand) {
		 this.brand= brand;
		}
		public String getbrand() {
				return brand;
		}
		public void setmodel(String model) {
			 this.model=model;
		}
		public String getmodel() {
				return model;
		}
		public void setengine(Engine engine) {
			 this.engine=engine;
		}
		public Engine getengine() {
				return engine;
		}
		public void settyres(Tyre[] tyres) {
			 this.tyres= tyres;
		}
		public Tyre[] gettyres() {
				return tyres;
		}
     public Car(int price,String brand,String model,Engine engine,Tyre[] tyres) {
    	 this.price=price;
    	 this.brand=brand;
    	 this.model=model;
    	 this.engine=engine;
    	 this.tyres=tyres;
     }
	@Override
	public String toString() {
		return "Car [price=" + price + ", brand=" + brand + ", model=" + model + ", color=" + color + ", engine="
				+ engine + ", tyres=" + Arrays.toString(tyres) + "]";
	}
     
     
}
