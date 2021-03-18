package ex09_upcasting;

public class Coffee {

	// field
	private String bean; 
	
	// constructor
	public Coffee(String bean) {
		super();
		this.bean = bean;
	}
	
	// method
	public void info() {
		System.out.println("원산지 : " + bean);
	}
	
	public void taste() {
		System.out.println("원두는 맛 없다.");
	}
	
}
