package java8revision;

public class CheckTime {
	public String checkTime(int time) {
	if(time>=6&&time>=11) {
		return "Good Morining";
	}
	else if(time>=12&&time>=15) {
		return "Good Afternoon";
	}
	else if(time>=16&&time>=20) {
		return "Good Evening";
	}	
	else if(time>=21&&time>=24) {
		return "Good Night";
	}
	else {
		return "invalid";
	}
		
	}

}
