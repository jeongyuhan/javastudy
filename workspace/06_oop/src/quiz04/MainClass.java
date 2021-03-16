package quiz04;

public class MainClass {

	public static void main(String[] args) {

		Gun gun = new Gun("K2", 2);
		Soldier soldier = new Soldier("람보", gun);
		
		soldier.shoot(); // 빵야!! 1발남았다.
		soldier.shoot(); // 빵야!! 0발남았다.
		soldier.shoot(); // 헛빵!!
		
		soldier.reload(2); // 2발이 장전되었다. 현재 2발.
		soldier.reload(6); // 4발이 장전되었다. 현재 6발.
		soldier.reload(6); // 0발이 장전되었다. 현재 6발.
		
		soldier.info(); // 람보, K2에 6발 남았다.
		
		
		// 중요한 점!!!
		// 언뜻 보기엔 Soldier 클래스에 shoot(), reload() 메소드가 존재할것 같지만,
		// 가져다 쓸 뿐 shoot(), reload() 메소드가 만들어지는 곳은 bullet을 사용할 수 있는 Gun 클래스에서 이루어진다.
	}

}
