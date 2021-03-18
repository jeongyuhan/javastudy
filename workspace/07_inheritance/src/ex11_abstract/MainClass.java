package ex11_abstract;

public class MainClass {
	public static void main(String[] args) {
		
		Staff staff = new SalaryMan("alice", 300);
		staff.info();
		
		// staff의 getPay()는 어떻게 호출할 것인가?
		// staff.getPay();
		// 1. Staff클래스에 getPay()를 추가해준다.
		// 2. SalaryMan타입으로 casting 한다. ((SalaryMan)staff).getPay();
		// 모든 staff들은 getPay()를 가져야 하므로 1번과 같은 방법이 좋은 해결책이다.
		
		System.out.println(staff.getPay());
	}
}
