package inhertitanceSuperKeyword;

public class MountainBike extends Bike {
	int speed;
	int weight;
	public MountainBike(String brand,int price,int modelyear,int speed,int weight) {
		super(brand,price,modelyear);
		this.speed=speed;
		this.weight=weight;
	}
		public String toString() {
			return super.toString()+speed;
		}
	}


