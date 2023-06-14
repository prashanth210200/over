package java8revision;

public class UseGreeting {
	public static void main(String[] args) {
		CheckTime c=new CheckTime();
		Greeting g=c::checkTime;
		System.err.println(g.findTime(23));
	}

}
