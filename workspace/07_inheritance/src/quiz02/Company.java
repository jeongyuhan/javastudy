package quiz02;

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
	}
	
	
}
