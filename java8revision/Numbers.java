package java8revision;
@FunctionalInterface
public interface Numbers {
//	public void findEven(int []a);
	
	public void findname(String name);

	
	public default String display() {
		return "sample num";
	}
	public static String show()
	{
		return "Static Method";
		
	}

}
