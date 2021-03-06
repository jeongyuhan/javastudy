package quiz01;

public class Watch {

	/*
	int hour;
	int minute;
	int second;
	
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int addHour(int h) {
		if(h != 0) {
			return (h % 24);
		} else {
			return 0;
		}
	}
	
	public int addMinute(int m) {
		if(m != 0) {
			return 
		}
	}
	
	public void see() {
		System.out.println();
	}
	*/
	
	
	// 선생님이 푼 해답)
	
	// field
	private int hour;
	private int minute;
	private int second;
	
	// constructor
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// method
	public void addHour(int hour) {
		this.hour += hour; 	// this.hour에 hour를 그대로 더해주면 주면 35시간이 된다.  
		this.hour %= 24;	// 그럼 24시간으로 나눠 나머지시간인 11을 현재시간으로 사용하면 된다.
	}
	
	public void addMinute(int minute) {
		this.minute += minute; 			// 받아온 minute를 this.minute에 더해준다.
		int hour = this.minute / 60; 	// 받아온 minute을 60으로 /한 값을
		addHour(hour); 					// hour에 더해준다.
		this.minute %= 60;				// 받아온 minute을 60으로 %한 값을 더해준다.
	}
	
	public void addSecond(int second) {
		this.second += second;			// 받아온 second를 this.second에 더해준다.
		int minute = this.second / 60;	// 더해진 this.second를 60으로 나눠진 몫을 minute로 저장한 뒤,
		addMinute(minute);				// addMinute()메소드에 몫 minute를 보내주면 addMinute()메소드에서 처리해서 hour와 minute으로 나눠간다.
		this.second %= 60;				// 나머지값을 가지고 second로 가져간다.
	}
	
	public void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
	
}
