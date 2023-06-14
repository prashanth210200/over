package fibonacciSeries;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList { 
	
	public List<Car> aList; 
	public List<Car> result = new ArrayList<Car>();
	
	public MyArrayList(List<Car> ip) {
		this.aList = new ArrayList<Car>(ip);
	} 
	
	public List<Car> getWhiteColor(List<Car> ip){
		for(Car c :ip) { 
			//System.out.print(c.name);
			if(c.getColor().equalsIgnoreCase("white")) {
				result.add(c);
			}
		} 
		return result;
	}
	

}
