package dayEightFor2;

public class VowelsCount {
	public static void main(String[] args) {
		String[ ] names= {"rzzzz","kumar","gokul","muthu"};
		int count=0;
		for(int i=0;i<=names.length-1;i++) {
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u")) {
			count++;
			System.out.println(names[i]);
			
					
		}
	}
		System.out.println(count);

}
}