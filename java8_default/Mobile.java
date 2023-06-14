package java8_default;

public class Mobile implements Electroins {
	public int resale(int price) {
		return price;
	}
	public  String  OnOff(boolean isOn) {
		if(isOn!=(true)) {
			return "product is working";
		}
		else {
			return "display Gone";	
		}
	}
}
