package dayFiveElseIfMethode;

public class AcTempeture {
	public static void main(String[] args) {
		int temp=22;
		if (temp>=16&&temp<20) {
			System.out.println("very cold weather");
		}
		else if (temp>=21&&temp<=25) {
			System.out.println("Cold weather");
		}
		else if (temp>=26&&temp<=30) {
			System.out.println("Normal Weather");
		}
		else {
			System.out.println("indicator");
		}
	}

}
