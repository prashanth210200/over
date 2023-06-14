package functions;

public class Multi {
	int num1 = 10;
	int num2 = 10;
//	public int total() {
//		return num1*num2;
//	}
//	public int total2(int n1,int n2) {
//	return(n1*n2);
//	}
//	public void total3() {
//		System.out.println(num1*num2);
//	}
//		public void total4(int n1,int n2) {
//			System.out.println(n1*n2);
//		} 
	
	int multi(int n1, int n2) {
		return n1*n2; 
	}
	
	public int multi() {
		return num1*num2;
	} 
	
	public int multi(int n1, int n2, int n3) {
		return n1*n2*n3;
	}
	
	public void dosome() {
		System.out.println(multi(5,5)); 
	}

} 


