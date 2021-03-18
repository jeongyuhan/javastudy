package quiz04;

// 클래스를 만들 때 abstract를 체크하면 바로 추상클래스가 된다.
public abstract class Fighter {

	// field
	private String name;
	private boolean isAlive; // energy가 0이면 false
	private int energy; // energy(1 ~ 100)
	private int power; // 공격력(1 ~ 10)

	// constructor
	public Fighter(String name, int energy, int power) {
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = true;
	}
	
	// method
	public abstract void attack(Fighter fighter);
	
	
}
