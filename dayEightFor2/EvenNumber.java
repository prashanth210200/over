package dayEightFor2;

public class EvenNumber {
	public static void main(String[] args) {
	int[] nums= {9,8,7,6,5,4,3,12,23,45};
	int count=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]%2==0) {
			count++;
			System.out.println(nums[i]);
		}
	}
		System.out.println(count);
		
		
	
	}
}
