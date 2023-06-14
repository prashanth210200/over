package dayEightFor2;

public class Stringvariable {
	public static void main(String[] args) {
		String [] names=new String [4];
		names [0]="raja";
		names[1]="kumar";
		names[2]="prakash";
		names[3]="gokul";
//		for(int i=0;i<names.length;i++) {
//		System.out.println(names[i].charAt(0));
//		}
	for(int i=0;i<names.length;i++) {
			System.out.println(names[i].charAt(names[i].length()-1));
		}
	}

}
