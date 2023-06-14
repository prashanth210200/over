package finalyKeyword;

public class FinalizeMethod {
	private String name;
	public void finalize() {
		System.out.println("Garbge Collection Excuted");
	}
	public FinalizeMethod(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		FinalizeMethod f=new FinalizeMethod("prashanth");
		System.out.println(f.hashCode());
		f=new FinalizeMethod("raja");
		System.gc();
		System.out.println(f.hashCode());
	}

}
