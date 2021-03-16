package quiz03;

public class Song {

	// field
	private String title;
	private double playTime; // 노래 재생시간

	// constructor
	public Song(String title, double playTime) {
		this.title = title;
		this.playTime = playTime;
	}

	public void info() {
		System.out.println(title + ", " + playTime);
	}

}
