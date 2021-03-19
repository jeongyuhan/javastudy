package quiz05;

public class Bunker {

	// field
	private Terran[] terrans;
	private int idx;
	
	// constructor
	public Bunker() {
		terrans = new Terran[10];
	}
	
	// method
	public void add(Bunkable terran) {
		if (idx < terrans.length) {
			terrans[idx++] = (Terran)terran; // Bunkable타입의 terran을 캐스팅하여 사용해도 되고,
		}									 // 애초에 받아오는 Terran[]을 Bunkable[]로 바꾸어 줘도된다. (이경우 메인까지 손봐야한다.)
	}
	
}
