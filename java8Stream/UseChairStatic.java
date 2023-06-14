package java8Stream;

public class UseChairStatic {
	public static void main(String[] args) {
		Chair chair1=new Chair();
    	Chair chair2=new Chair();
    	Chair chair3=new Chair();
		Chair.staticmethod();
	}
	static {
		System.out.println("static Block Executed");

	}

}
