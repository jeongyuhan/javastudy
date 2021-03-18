package quiz03;

public class Company {

	// field
	private Staff[] staffList;
	private int idx;
	
	// constructor
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
	}

	// method
	// (Staff staff) 과같은 매개변수에는 new SalaryMan()과 같은 값을 전달할 수 있다.
	public void hireStaff(Staff staff) {
		if(idx == staffList.length) {
			System.out.println("직원을 모두 고용했습니다.");
			return;
		}
		staffList[idx++] = staff;
		
	}
	
	public void staffInfo() {
		for(Staff staff : staffList) {
			if(staff != null) {
				staff.info();
			}
		}
		System.out.println("SalaryMan의 급여총액 : " + getSalaryManTotalPay());
	}
	
	// SalaryMan들에게 지급된 급여총액
	public int getSalaryManTotalPay() {
		// Staff[] StaffList; 이므로 저장된 객체들이 SalaryMan인지 아닌지 검사해 봐야 한다.
		int salaryManTotalPay = 0;
		for(Staff staff : staffList) {
			if (staff instanceof SalaryMan) {
				if(!(staff instanceof SalesMan)) { // 서브클래스로 SalesMan의 getPay()를 SalaryMan으로 착각하여 추가시키기 때문에 따로 제외를 시켜줘야한다.
					salaryManTotalPay += ((SalaryMan) staff).getPay();					
				}
			}
		}
		return salaryManTotalPay;
	}
	
	
}
