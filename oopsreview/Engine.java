package oopsreview;

public class Engine {
	private int speed;
	private String brand;
	private String model;

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return speed;
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
	 public Engine(int speed,String brand,String model) {
    	 this.speed=speed;
    	 this.brand=brand;
    	 this.model=model;
	 }

	@Override
	public String toString() {
		return "Engine [speed=" + speed + ", brand=" + brand + ", model=" + model + "]";
	}
	 

}
