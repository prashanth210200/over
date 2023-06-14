package fibonacciSeries;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_series { 
 public static void  main(String [] args) {
			int n1=0, n2=1, n3,i,count=12;
			//System.out.println(n1+"/n"+n2);
			for(int i1=1;i1<count;i1++) {
				n3=n1+n2;
				System.err.println(n3);
				n1=n2;
				n2=n3;
			}
			}
				
			}