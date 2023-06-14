package hashMap_collection;

import java.util.HashMap;
import java.util.Iterator;

public class UseCar {
	public static void main(String[] args) {
		Car a = new Car("toyato", 789654123, 200000, "White", "Sports");
		Car b = new Car("volo", 789632547, 800000, "White", "Sports");
		Car c = new Car("audi", 12365479, 400000, "Black", "Sports");
		Car d = new Car("bens", 852369741, 500000, "yelow", "Sports");
		Car e = new Car("tata", 147852369, 900000, "White", "Sports");
		HashMap<Integer, Car> cars = new HashMap<>();
		cars.put(a.getChaseNo(), a);
		cars.put(b.getChaseNo(), b);
		cars.put(c.getChaseNo(), c);
		cars.put(d.getChaseNo(), d);
		cars.put(e.getChaseNo(), e);

		// }
		// for removing values using Itration
//		Iterator<Car> utr = cars.values().iterator();
//		while (utr.hasNext()) {
//			if (utr.next().getBrand().startsWith("a")) {
//				utr.remove();
//			}

			// System.out.println(cars. get(utr).getBrand());

	//	}
		Iterator<Car>itr=cars.values().iterator();
		while (itr.hasNext()) {
			if (itr.next().getColor().equalsIgnoreCase("white")) {
				itr.remove();
			}
		}
				cars.forEach((x,y)->System.out.println(y.getBrand()));
			
	}
}
