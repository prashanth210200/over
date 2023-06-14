package oopsreview;

import java.util.Arrays;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine(213,"TATA","BLUE");
		Tyre fr=new Tyre(123,"MRF","SPORT");
		Tyre fl=new Tyre(123,"APPLO","SPORT");
		Tyre br=new Tyre(123,"MORE","SPORT");
		Tyre bl=new Tyre(123,"CLASSIC","SPORT");
		Tyre[] t= {fr,fl,br,bl};
		Car c=new Car(133,"TATA","LUX",e,t);
	System.out.println(c);
		System.out.println(Arrays.toString(t));
		System.out.println(c.getbrand());
	}

}
