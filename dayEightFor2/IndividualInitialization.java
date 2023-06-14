package dayEightFor2;

public class IndividualInitialization {
	public static void main(String[] args) {
		int[]nums=new int [4];
	nums[0]=15;
	nums[1]=30;
	nums[2]=25;
	nums[3]=50;
//	for(int i=0;i<nums.length;i++) {
//		System.out.println(num[i]);
//	}
	for(int i=nums.length-1;i>=0;i--) {
	//	if(nums[i]%2==0) {
	//System.out.println(nums[i]);
		//}
		 if(nums[i]<nums[3]) {
			System.out.println(nums[i]);
		}
	}

	}
}
