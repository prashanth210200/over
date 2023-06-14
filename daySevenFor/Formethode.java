package daySevenFor;

public class Formethode {
	public static void main(String[] args) {
	//	char[] a=args[0].toCharArray();
	//	Integer val=Integer.parseInt(a);
		int val=2;
	int num=0;
		for(int i=1;i<=val;i++) {
			num=num+val+i;
		}
		
	System.out.println((num*(num+1)/2)+(num*num));
		for(int i=1;i<=val;i++) {
			num=num+(i*i*i);
			num+=Math.pow(i, 3);
			
				
			}
			System.out.println(num);
//			
//			for(int i=a.length-1;i>=0;i--) {
//				System.out.println(a[i]);
//			}
////			System.out.println(a.toCharArray());
				
		}
	}

 