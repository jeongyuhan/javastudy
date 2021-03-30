package quiz01;

public class Gun extends Weapon implements Runnable {

	private String model;
	private int bullet;

	public Gun(String name, int shot) {
		super();
		this.model = name;
		this.bullet = shot;
	}

	@Override
	public void run() {
		for (int i = 0; i < bullet; i++) {
			shoot(i);
		}
	}

	public void shoot(int nth) {
		if(bullet == 0) {
			System.out.println("헛빵!");
			return;
		} 
			System.out.println(model + (nth + 1) + "발 쐈다.");
	}

}
