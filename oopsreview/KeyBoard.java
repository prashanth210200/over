package oopsreview;

public class KeyBoard {
	private String name ;
	private int num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "KeyBoard [name=" + name + ", num=" + num + "]";
	}

}
