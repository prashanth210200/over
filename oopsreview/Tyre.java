package oopsreview;
//aggregationmethode
public class Tyre {
	private int price;
	private String brand;
	private String model;
	// private String color;

	public void setprice(int price) {
		this.price = price;
	}

	public int getprice() {
		return price;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getbrand() {
		return brand;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public String getmodel() {
		return model;

	}
	 public Tyre(int price,String brand,String model) {
    	 this.price=price;
    	 this.brand=brand;
    	 this.model=model;
    
     }

	@Override
	public String toString() {
		return "Tyre [price=" +"\n"+ price + "\n"+", brand=/" + brand+"\n" + ", model=" + model + "]";
	}
	 
}
