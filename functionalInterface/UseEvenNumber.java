package functionalInterface;

import java.util.ArrayList;

public class UseEvenNumber {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(455);
		nums.add(25);
		nums.add(35);
		nums.add(45);
		nums.add(55);
		nums.add(65);
		
		EvenNumbers a= ss -> {
			for(Integer y:ss) {
				if(y%2==0) {
					System.out.println(y);
				}
			}
		};
		a.evenNumber(nums);
	}
}
