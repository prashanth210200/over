package dayEightFor2;

public class Length {
	public static void main(String[] args) {
		String[] names= {"kumar","dinesh","rajaeeeee","raeni"};
		int count =0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<=5) {
				count++;
				System.out.println(names[i]);
				
			}
		}
		System.out.println(count);
	}

}
