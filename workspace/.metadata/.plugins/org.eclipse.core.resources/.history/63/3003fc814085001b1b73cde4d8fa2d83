package quiz07;

public class Game {

	// field
	private Player[] players; // player가 여러명 저장될 수 있는 Player[] 배열(완벽한 배열x)

	// constructor
	public Game(int playerCount) {
		players = new Player[playerCount]; // 선언과 배열의 생성을 분리하여 사용한다.(완벽한 배열o)
	}
	
	// method
	// Player클래스에서 name만을 관리한다고 하였기 때문에 게임을 하는 player의 수만큼 이름을 받아서 관리하거나 정해둔 이름을 선택하여 사용할 수 있게 관리하는 등으로 만든다.
	public void setPlayers() {
		String[] names = {"alice", "david", "brown", "emily", "james"};
		for(int i = 0; i < players.length; i++) {
			// players[i].setName(name); // player의 생성자가 없을 때 사용
			players[i] = new Player(names[(int)(Math.random() * names.length)]); // 0~4사이의 랜덤값이 정해지고 그인덱스가 names[] 로 들어가 이름을 만들어준다.
		}
	}
	
	public void play() {
		// Player들의 play() 결과를 저장 할 int[] times
		int[] times = new int[players.length];
		for(int i = 0; i < players.length; i++) {
			times[i] = players[i].play();
		}
		// times 배열에서 10과 가장 가까운 값 찾기
		// (times[i] - 10)의 절대값을 구한 뒤 그 중 가장 작은 값(최소값)을 구한다.
		// 절대값 : Math.abs(n)  n의 절대값
		int min = Math.abs(times[0] - 10); // 미니멈의 초기화는 첫 번째 요소를 초기화로 사용한다.
		int winnerNo = 0;
 		for(int i = 1; i < times.length; i++) {
			if(min > Math.abs(times[i] - 10)) {
				min =  Math.abs(times[i] - 10);
				winnerNo = i;
			}
		}
 		for(int i = 0; i < players.length; i++) {
 			System.out.println(players[i].getName() + "'s result : " + times[i] + "second");
 		}
 		System.out.println(players[winnerNo].getName() + "'s victory!");
	}
	
	
}
