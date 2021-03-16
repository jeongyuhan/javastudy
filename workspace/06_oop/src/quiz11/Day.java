package quiz11;

public class Day {

	// field
	private String schedule;

	
	// constructor
	
	// method
	public String getSchedule() {
		return schedule;
	}
	
	// setSchedule은 스케줄을 저장하는 메소드
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public void info() {
		if(schedule == null || schedule.isEmpty()) { // isEmpty() 빈문자열을 나타내는 메소드
			System.out.println("[없음]");
		} else {
			System.out.println("[" + schedule + "]");
		}
	}
	
	
	
}
