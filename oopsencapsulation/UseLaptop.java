package oopsencapsulation;

public class UseLaptop {
	public static void main(String[] args) {
		
	
	Display d=new Display();
	d.setname("jdbfi");
    d.setprice(121);
    
    Laptop l=new Laptop();
    l.setbrand("djfbi");
    l.setprice(5454);
    l.setdis(d);
	
    System.out.println(d.getname()+"+");
	}
}
