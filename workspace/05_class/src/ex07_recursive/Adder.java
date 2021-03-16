package ex07_recursive;

public class Adder {

	private int total; // 0으로 자동 초기화
	
	public void calculate(int n) {
		if(n == 0) {
			return; // 결과타입이 void인 메소드를 끝내는 코드 : return;
		}
		total += n;
		calculate(n-1);
	}

	
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
	
	
	
	
}
