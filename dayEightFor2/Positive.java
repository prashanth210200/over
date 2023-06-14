package dayEightFor2;

public class Positive {
	public static void main(String[] args) {
		
	int count=0;
	int [] nums= {0,1,2,3,-1,-2,-3};
	for(int i=0;i<nums.length;i++) {
		if(count<nums[i]) {
			count++;
			System.out.println(nums[i]);
			
		}
		
	}	
	System.out.println(count);
	
	
	}

}
