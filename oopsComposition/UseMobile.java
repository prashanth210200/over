package oopsComposition;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.capacity=1000;
		b.brand="google";
		b.price=101010;
		b.batteryType="Aluminiam";
		
		Mobile m=new Mobile();
		m.brand="nokia";
		m.price=12664;
		m.color="Blue";
		m.battery=b;
		 Mobile m1=new Mobile();
		 m1.brand="LG";
		 m1.price=154754;
		 m1.color="red";
		 m1.battery=b;
		 System.out.println(m.battery.brand+" "+m.battery.price+" "+m.color+" "+m1.brand+" "+b.brand);
	}

}
