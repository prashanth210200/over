package functionalInterface;
@FunctionalInterface

public interface Laptop {
	public int ram(int a);
	
	public static String Brand(int price) {
		if (price>50000) {
			return "Hp,Mac";
		}
		else
		{
			return"lenova";
		}
	}

}
