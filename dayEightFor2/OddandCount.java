package dayEightFor2;

public class OddandCount {
	public static void main(String[] args) {
		int [] nums= {21,22,23,24,25,26,27,28,29,30};
		int count =0;
		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i]%2!=0) {
				count=count+1;
			System.out.println(nums[i]);
			
			}
			
		}
		System.out.println("count: "+count);
		
	}

}
