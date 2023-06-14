package oopsComposition;

public class UseCar {
public static void main(String[] args) {
	Engine e=new Engine();
	e.brand="ford";
	e.price=125464;
	e.enginecc=154;
	
	Car c=new Car();
	c.brand="bmw";
	c.price=4985;
	c.engine=e;
	System.out.println(c.engine.brand +" "+c.engine.price);
	System.out.println(c.brand);
}

}
