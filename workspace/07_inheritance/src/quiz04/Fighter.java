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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
		this.energy = this.energy < 0 ? 0 : this.energy; // 에너지가 - 값이 되는 경우를 잡아주는 코드
		setAlive(this.energy > 0); // 0보다 크면 true값으로 살아있다가 전달되고, 반대는 false가 전달된다.
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void info() {
		System.out.println("[이름 : " + name + ", 에너지 : " + energy + ", 공격력 : " + power + "]" );
	}
	
	
}
