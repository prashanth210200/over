package functionalInterface;

public class Name {
	public static String findNameMax(String[] a) {
		String value=a[0];
		for(String x:a) {
			if(x.length()>=value.length()) {
				value=x;
			}
		}
		return value;
		
	}

}
