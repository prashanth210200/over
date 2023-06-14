package java8_default;

public interface Electroins {
public int resale(int price);
public default String  OnOff(boolean isOn) {
	if(isOn==(true)) {
		return "product is working";
	}
	else {
		return "not working";
		
	}
}
}
