package dayEightFor2;

public class Ashif {
	public static void main(String[] args) {
//		Integer n = Integer.parseInt(args[0]);
//		for (int i=2; i<=n; i+=2) {
//			System.out.println(i);
//		}
		for (int i=1; i<args[0].toCharArray().length; i+=2) {
			System.out.println(args[0].toCharArray()[i]);
		}
//		String[] input = args[0].split("@");
//		for(int i=0; i<input.length; i++) {
//			char s = input[i].charAt(0);
//			if(Character.isUpperCase(s)) {
//				System.out.println(input[i]);
//			}
//			//if((input[i].charAt(0)) .isUpperCase())
//		}
	}
}