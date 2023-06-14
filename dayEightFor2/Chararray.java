package dayEightFor2;

public class Chararray {
	public static void main(String[] args) {
	char[] names= {'a','b','c','d','e'};
	int count=0;
	for(int i=0;i<names.length;i++) {
		if(names[i]=='a'||names[i]=='e'||names[i]=='i') {
			count++;
			System.out.println(names[i]);
		}
	}
	System.out.print(count);
	}

}
