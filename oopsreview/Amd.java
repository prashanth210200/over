package oopsreview;

public class Amd {
	private String brand;
	private int ram;
	public Amd(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Amd [brand=" + brand + ", ram=" + ram + "]";
	}
	
	
}



