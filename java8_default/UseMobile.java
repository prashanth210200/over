package java8_default;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.resale(45));
		System.out.println(m.OnOff(false));
		System.out.println(m.OnOff(true));
	}

	static {
		System.out.println("Master return");
	}
}
