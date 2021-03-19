package quiz05;

public class MainClass {

	public static void main(String[] args) {

		Bunker bunker = new Bunker();
		bunker.add(new Marine());
		bunker.add(new Firebat());
		// bunker.add(new Tank()); // 불가능

	}

}

// quiz05는 상속과 구현의 관계를 이해하기위한 예제로 다른 출력되는 내용없이 진행되기 때문에 
// Terran클래스는 슈퍼클래스로서 
// Marine, Firebat, Tank 클래스에서 상속받기위한 역할을 하고 있고 
// Marine, Firebat, Tank 클래스 또한 상속을 받는다는 것만 포함하고 있기 때문에 내용은 따로 필요없이 extends만 해주면된다.
// Bunkable 인터페이스는 Bunker에 들어갈 수 있는 Marine, Firebat만 구현이 가능하게 범위를 정하는 역할로 비어있게 생성만 해주면 되고
// Marine, Firebat클래스 에서는 implements만 해주면 된다.
// 내용이 있는 클래스는 Bunker클래스로 Tank를 제외한 Marine, Firebat만 들어갈 수 있다는 것을 확인하기 위한 코드만 짜주면된다.