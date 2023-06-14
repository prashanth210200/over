package dataAbstractionInterface;

public class CubBank implements Bank {
public long accNum(long a) {
	return a;
	
}
public int pinnum(int b) {
	return b;
}
public float rateOfInterest(int amt) {
	return amt=amt*5/100;
	
}

}
