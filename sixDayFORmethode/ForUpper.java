package sixDayFORmethode;

public class ForUpper {
	public static void main(String[] args) {
		String name="NIsha";
		int ucount=0;
		int lcount=0;
		String a=name.toUpperCase();
	    for(int i=0;i<name.length();i++) {
	    	if(name.charAt(i)==a.charAt(i)) {
	    		ucount++;
	    	}
	    	else {
	    		lcount++;
	    		
	    	}
	    
	    }
	    
	    System.out.println(ucount);
	    System.out.println(lcount);
	}

}
