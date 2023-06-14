package daytwoclass;

public class Stringmethode {
	public static void main(String[] args) {
		String str="thiyagrajan";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	    System.out.println(str.length());
		System.out.println(str.concat("prashanth"));
		System.out.println(str.equals("thiyagarajan"));
	    System.out.println(str.equalsIgnoreCase("thiyagarajan"));
	    System.out.println(str.startsWith("t"));
	    System.out.println(str.endsWith("an"));
	    System.out.println(str.contains("ro"));
	    System.out.println(str.substring(2));
	    System.out.println(str.charAt(str.length()-1));
	    System.out.println(str.indexOf("r"));
	}

}
