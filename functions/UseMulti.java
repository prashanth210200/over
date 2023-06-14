package functions;


public class UseMulti {public static void main(String[] args) {
//	Multi mult1=new Multi();
//	mult1.num1=50;
//	mult1.num2=20;
//	System.out.println(mult1.total());
//	
//	Multi mult2=new Multi();
//System.out.println(mult2.total2(50,30));
//
//
//Multi mult=new Multi();
//     mult.total3();
//     
//     Multi mult4=new Multi();
//     mult4.total4(40,70); 
	Multi mul = new Multi();  
	
	int a1 = mul.multi(); 
	int a2 = mul.multi(5,2); 
	int a3 = mul.multi(5,5,5); 
	
	System.out.println(a1+" "+a2+" "+a3);
     
	
}


}
