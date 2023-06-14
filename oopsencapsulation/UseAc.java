package oopsencapsulation;

public class UseAc {
	public static void main(String[] args) {
		Compressor c=new Compressor();
		c.setBrand("abc456");
		c.setPrice(750112);
		Ac a=new Ac();
		a.setBrand("jdfo564");
		a.setPrice(456545);
		a.setCom(c);
		
		System.out.println(a.getBrand()+" "+a.getCom().getPrice());
		
		
		
	}

}
