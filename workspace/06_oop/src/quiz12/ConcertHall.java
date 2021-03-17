package quiz12;

import java.util.Scanner;

public class ConcertHall {

	// field
	private String hallName;
	private char[] seatTypes = {'S', 'R', 'A', 'B'};
	private int[] seatCounts = { 10, 10, 10, 10};
	private int[] charges = {200000, 150000, 100000, 50000};
	private SeatGroup[] seatGroups;
	Scanner sc = new Scanner(System.in);
	
	// constructor
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[seatTypes.length]; // 배열만 생성
		// SeatGroup 생성
		for(int i = 0; i < seatGroups.length; i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);
		}
	}
	
	// method
	public void run() {
		while(true) {
			menu();
			System.out.println("작업 선택 >>>>");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : reservation(); break;
			case 2 : cancel(); break;
			case 3 : inquiry(); break;
			case 4 : info(); break;
			case 0 : exit(); return;
			default : System.out.println("잘못된 작업입니다. 다시 시도하세요.");
			}
		}
	}
	
	public void menu() {
		System.out.println("=====예매프로그램=====");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황");
		System.out.println("0. 프로그램 종료");
		System.out.println("==================");
	}
	
	// 예매
	public void reservation() {
		System.out.println("예매할 좌석 타입(S, R, A, B) 입력 >>>>");
		char seatType = sc.next().charAt(0); // char 타입의 입력은 따로 없기 때문에 next()로 입력받고 charAt(0)로 한글자를 따온다.
		for(int i = 0; i < seatTypes.length; i++) {
			if(seatType == seatTypes[i]) {
				seatGroups[i].reservation();
			}
		}
	}
	
	// 예매 취소
	public void cancel() {
		System.out.println("예매 취소할 좌석 타입(S, R, A, B) 입력 >>>>");
		char seatType = sc.next().charAt(0); // char 타입의 입력은 따로 없기 때문에 next()로 입력받고 charAt(0)로 한글자를 따온다.
		for(int i = 0; i < seatTypes.length; i++) {
			if(seatType == seatTypes[i]) {
				seatGroups[i].cancel();
			}
		}
	}
	
	// 예매 조회
	public void inquiry() {
		System.out.println("조회할 사용자 이름 입력 >>>>");
		String name = sc.next();
		for(int i = 0; i < seatGroups.length; i++) { // S R A B 를 먼저 찾는 작업
			SeatGroup seatGroup = seatGroups[i];
			Seat[] seats = seatGroup.getSeats();
			for(int j = 0; j < seats.length; j++) { // 다른 클래스에 있는 seats배열을 불러오려면 getter를 사용하여 불러와야한다. 
				if(seats[j].getName() != null && seats[j].getName().equals(name)) { // null 이 아닌 경우를 먼저 체크를 해줘야한다. 아니면 nullpointException이 발생한다.
					System.out.println(seatTypes[i] + "타입 " + (j + 1) + "번 좌석이 " + name + "님에게 예약되어 있습니다.");
					return;
				}
			}
		}
	}
	
	// 전체 예매 현황
	public void info() {
		System.out.println("홀 : " + hallName);
		System.out.println("예매 총액 : " + getTotalCharge() + "원");
		for(SeatGroup seatGroup : seatGroups) {
			seatGroup.info();
			System.out.println();
		}
	}
	
	// 전체 예매 총액 반환
	public int getTotalCharge() {
		int total = 0;
		for(SeatGroup seatGroup : seatGroups) {
			total += seatGroup.getTotalCharge();
		}
		return total;
	}
	
	// 프로그램 종료
	public void exit() {
		System.out.println(hallName + "예매 프로그램을 종료합니다");
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
}
