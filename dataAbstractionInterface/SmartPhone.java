package dataAbstractionInterface;

public class SmartPhone implements Phone {
	public String voicecall(String a) {
		return a;
	}
	public  String videocall(String b) {
		return b;
		
	}
	public int connectivity(int c) {
		return c;
		
	}
	public String cameraFunction(String tapping) {
		switch(tapping) {
		case"singletapping":return"takingPicture";
		
		case"doubletapping":return"Zooming";
		case"continuestapping":return"continustapping";
		default :return"noCamera";

		}
	}

}
