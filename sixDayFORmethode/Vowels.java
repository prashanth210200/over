package sixDayFORmethode;

public class Vowels {
	public static void main(String[] args) {
		String name= "kalai";
		for (int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				System.out.println(name.charAt(i)+" in vowel");
			}
			else {
				System.out.println(name.charAt(i)+" not vowel");
			}
		}
	}

}
