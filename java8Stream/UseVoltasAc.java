package java8Stream;

public class UseVoltasAc {
	public static void main(String[] args) {
		int[] b= {10000,20000,3000};
		System.out.println(Ac.findMaxPrice(b));
		System.out.println(VoltasAc.findMaxPrice(b));
		
	}

}
