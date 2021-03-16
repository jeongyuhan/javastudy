package quiz12;

import java.util.Scanner;

public class SeatGroup {

	// field
	private char seatType; // 'S', 'R', 'A', 'B' 좌석등급
	private int charge; // 좌석등급별 금액
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public SeatGroup(char seatType, int seatCount, int charge) {
		this.seatType = seatType;
		this.charge = charge;
		this.seats = new Seat[seatCount]; // 배열 생성 (배열의 정보는 아직 없는 상태)
		// 배열에 실제 Seat를 생성 작업
		for(int i = 0; i < seatCount; i++) {
			seats[i] = new Seat(); // 빈 좌석을 생성 ()안에 이름을 넣으면 누군가 예매을 안하고 점유를 하게 된 것을 의미한다.
		}
	}

	
	// method
	public Seat[] getSeats() {
		return seats;
	}
	
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
	
	
	
	
	
	
}
