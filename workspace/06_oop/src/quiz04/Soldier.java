package quiz04;

public class Soldier {

	// field
	private String name;
	private Gun gun;
	
	// constructor
	public Soldier(String name, Gun gun) {
		this.name = name;
		this.gun = gun;
	}
	
	// method
	
	// Gun에서 만든 shoot을 불러오는 방법
	public void shoot() {
		gun.shoot();
	}
	
	// Gun에서 만든 reload를 불러오는 방법
	public void reload(int bullet) {
		gun.reload(bullet);
	}

	public void info() {
		System.out.print(name + ", ");
		gun.info();
	}
		
	
}
