package inhertitanceMethodeOverriding;

public class Book extends StoryBook{
	public String findDay(int Day) {
		if(Day==100) {
			return"day100";
			
		}
		else {
			return "notday100";
			
		}
	}

}
