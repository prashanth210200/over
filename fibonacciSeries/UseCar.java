package fibonacciSeries;

import java.util.ArrayList;
import java.util.List;

import collection_ArrayList.Employee;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car("Audi", 24500, "White", 1000);
		Car c2 = new Car("benz", 23400, "Yellow", 1000);
		Car c3 = new Car("polo", 22000, "red", 1000);
		Car c4 = new Car("tata", 58646, "White", 1000);
		Car c5 = new Car("BMW", 524552, "Pink", 1000);
		Car c6 = new Car("swift", 59874, "yellow", 1000);
		Car c7 = new Car("Honda", 32541, "Blue", 1000);
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		getWhiteColor(cars); 
		//System.out.print("hii");
		MyArrayList myList = new MyArrayList(cars);  
		
		myList.getWhiteColor(cars);
	//	List<Car> res = myList.getWhiteColor(); 
		//res.forEach(x-> System.out.println(x.color));
		

		//for (Car x : cars) {
			//if (x.getColor().equalsIgnoreCase("White")) {
			//	System.out.println(x.getName() + " " + x.getPrice());
		//c
				//cars.forEach(y -> System.out.println(y));
			}
		
	public static List<Car> result = new ArrayList<Car>();
	

	public static List<Car> getWhiteColor(ArrayList<Car> aList){
		for(Car c :aList) {
			if(c.getColor().equalsIgnoreCase("white")) {
				result.add(c);
			}
		} 
		return result;
	}
}
