package quiz08;

public class Singer {

	// field
	private String name;
	private Song[] songs;
	private int idx;

	
	// constructor
	public Singer(String name, int songCount) {
		this.name = name;
		songs = new Song[songCount];
	}
	
	// songCount는 최대 저장가능 노래개수이고, 실제 저장된 개수는 idx개 이다.
	
	// method
	public void addSong(Song song) {
		if(idx < songs.length) {
			songs[idx++] = song; 
			// addSong() 호출마다 idx가 증가하므로, idx는 추가된 노래의 개수이다.			
		} else {
			System.out.println("더 이상 노래를 추가할 수 없습니다.");
		}
	}
	
	public void info() {
		// 가수명, 노래목록
		System.out.println("가수명 : " + name);
		System.out.println("=====노래목록=====");
		/* for(int i = 0; i < songs.length; i++) {
			if(songs[i] != null) {
				songs[i].info(); // 최대 저장가능 곡과 저장된 곡의 개수가 다를 경우 저장되지 않은 인덱스값의 정보가 이상하게 처리되기 때문에 
				                 // if문을 추가해서 코드를 만들어준다. 				
			}
		}*/
		for(int i = 0; i < idx; i++) {
			songs[i].info();	// 위와 같이 if문을 추가하면서 구성하기 싫다면 i의 길이를 idx(저장된 곡의 개수)로 지정하여 문제를 잡아낸다. 
		}
	}
	
	
	
	
	
	
}
