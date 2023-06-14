package sixDayFORmethode;

public class AndOperatInFor {
	public static void main(String[] args) {
		for(int i=50;i<=250;i++) {
			if(i%2==0&&i%3==0) {
				System.out.println(i+"this is diviable by both");
			}
		}
	}

}
