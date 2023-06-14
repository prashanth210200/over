package objectarray;

public class UseStudent { 
	static int jj =0;
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		String[] b=args[1].split(",");
		String[] c=args[2].split("@"); 
		
		
		
		
		Student x1=new Student(); // create object
		x1.name=a[0];
		x1.age=Integer.parseInt(a[1]);
		x1.weight=Float.parseFloat(a[2]);
		x1.ispresent=Boolean.parseBoolean(a[3]); 
		x1.display1(); // non static
		Student.display(); // static
		
		Student x2=new Student();
		x2.name=b[0];
		x2.age=Integer.parseInt(b[1]);
		x2.weight=Float.parseFloat(b[2]);
		x2.ispresent=Boolean.parseBoolean(b[3]);
		
		Student x3=new Student();
		x3.name=c[0];
		x3.age=Integer.parseInt(c[1]);
		x3.weight=Float.parseFloat(c[2]);
		x3.ispresent=Boolean.parseBoolean(c[3]);
		int i = 0;
		Student [] students= {x1,x2,x3};
		boolean max= true;
		Student temp=null;
		for(Student val:students) {
			if(val.ispresent==max) { 
				int k = 0;
				i++;
			}
			//System.out.println(val);
			
		}  
		//System.out.println(k);
		System.out.println(i);
	//	System.out.println(students[1]);
		
	} 
	 
	public void display() {
		System.out.println("HI");
	}

}
