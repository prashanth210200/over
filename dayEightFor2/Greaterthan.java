package dayEightFor2;

public class Greaterthan {
	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5,6,7,8,9,10};
		int max=nums[0];
//		for(int i=0;i<=nums.length-1;i++) {
//			if(nums[i]>=max) {
//				max=nums[i];
//			}
//		}
//			System.out.println(max);
		
		for (int i=0;i<=nums.length-1;i++) {
			if(nums[i]<=max) {
				max=nums[i];
				
			}
			
		}
		System.out.println(max);
	}

}
