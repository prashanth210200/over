package dayfourhome;

public class Cammaseparator {
	public static void main(String[] args) {
		String a= args[0];
		String[ ]box=a.split(",");
		int num1=Integer.parseInt(box[0]);
		int num2=Integer.parseInt(box[1]);
		int num3=Integer.parseInt(box[2]);
		int num4=Integer.parseInt(box[3]);
		int num5=Integer.parseInt(box[4]);
		System.out.println((num1+num2+num3+num4+num5)/5);
	
		
	}

}
