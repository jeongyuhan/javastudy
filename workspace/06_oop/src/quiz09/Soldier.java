package quiz09;

public class Soldier {

	// field
	private String name;
	private Gun[] guns;
	private int idx;
		
	// constructor
	public Soldier(String name, int gunCount) {
		this.name = name;
		guns = new Gun[gunCount];
	}
	
	// method
	public void addGun(Gun gun) {
		if(idx < guns.length) {
			guns[idx++] = gun;
		} else {
			System.out.println("더 이상 총을 추가할 수 없습니다.");
		}
	}
	
	public void shoot() {
		for(int i = 0; i < idx; i++) {
			guns[i] .shoot();
		}
	}
	
	// 총 번호를 입력하였을때 shoot을 사용하는방법
	public void shoot(int gunNo) {
		guns[gunNo-1].shoot();
	}
	
	// 총 번호가 아닌 총의 이름을 입력하였을때도 shoot을 사용하는방법
	public void shoot(String model) {
		for(int i = 0; i < idx; i++) {
			if(guns[i].getModel().equals(model)) {
				guns[i].shoot();
			}
		}
	}
	
	// 향상 for문을 활용한 reload
	public void reload(int bullet) {
		for(Gun gun : guns) {
			if(gun != null) {
				gun.reload(bullet);
			}
		}
	}
	
	// 총 번호를 입력하였을때 reload하기
	public void reload(int gunNo, int bullet) {
		guns[gunNo-1].reload(bullet);
	}
	
	// 모델 이름을 입력하였을때 reload하기
	public void reload(String model, int bullet) {
		for(Gun gun : guns) {
			if(gun != null && gun.getModel().equals(model)) {
				gun.reload(bullet);
			}
		}
	}
	
	public void info() {
		System.out.println("이름 : " + name);
		for(int i = 0; i < idx; i++) {
			guns[i].info();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
