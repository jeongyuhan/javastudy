package quiz04;

public class KoreanFighter extends Fighter{

	// field 
	// 없다.
	
	// constructor	
	public KoreanFighter(String name) {
		super(name, (int)(Math.random() * 100) + 1, (int)(Math.random() *10) + 1);
	}
	
	// method
	// attack() : 20% 확률로 한 방에 KO 시킬 수 있다.
	@Override
	public void attack(Fighter fighter) { // (매개변수) 에는 KoreanFighter 와 GlobalFighter를 모두 저장할 수 있는 Fighter타입을 넣어주는 것이 좋다.
		// 나 : this
		// 상대편 : fighter
		if(Math.random() < 0.2) { // 20%확률
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + "KO!");
		} else {
			// 내 power만큼 상대편 energy가 줄어든다.
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격 : " + this.getName() + "[" + fighter.getName() + "남은 에너지 : " + fighter.getEnergy() + "]");
			
		}
		
	}
	
	
	
}
