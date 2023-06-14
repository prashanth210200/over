package functionalInterface;

public class Methode {
	public static int findmax(int[] a) {
		int  max=a[0];
		for(int x:a) {
			if(x>max) {
				max=x;
			}
			}
		return max;
		
		}
	
public static int findmini(int[] a) {
	int mini=a[0];
	for(int x:a) {
		if(x>mini) {
		mini=x;
		}
		}
	return mini;
	
	}
}


