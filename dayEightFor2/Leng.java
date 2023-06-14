package dayEightFor2;

public class Leng {
	public static void main(String[] args) {
		String[] name= {"sun","moon","star","earth"};
		String max=name[0];
		for(int i=0;i<=name.length-1;i++) {
			if(name[i].length()>=max.length()) {
				max=name[i];
			}
		}
		System.out.println(max);
	}

}
