package java8Stream;

public class VoltasAc extends Ac {
public static int findMaxPrice(int[]a) {
	int max=a[0];
	for(int i:a) {
		if(max<i) {
			max=i;
		}
	}
	return max+1000;
}
}
