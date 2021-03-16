package quiz12;

public class Seat {

	// field
	private String name;
	
	// constructor
	
	// method	
	// 1. 예매자 이름 확인
	public String getName() {
		return name;
	}
	
	// 2. 예매 (예매자 이름 저장)
	public void setName(String name) {
		this.name = name;
	}
	
	// 3. 예매 취소
	public void cancel() {
		this.name = null;
	}
	
	// 4. 예매 여부 확인
	//	1) 예매가 된 좌석	: false (예매 불가 의미)
	//	2) 예매가 안된 좌석 : true (예매 가능 의미)
	public boolean check() {
		return (name == null);
	}
	
	// 5. 좌석 확인
	public void info() {
		if(name == null) {
			System.out.println("가능");
		} else {
			System.out.println(name);
		}
	}
	
}
