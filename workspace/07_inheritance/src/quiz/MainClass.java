package quiz;

public class MainClass {

	public static void main(String[] args) {
		
		// SalaryMan
		SalaryMan staff1 = new SalaryMan("james", 300);
		System.out.println(staff1.getName());
		System.out.println(staff1.getPay());
		
		// SalesMan
		SalesMan staff2 = new SalesMan("brown", 100);
		staff2.setSalesAmount(2000);
		System.out.println(staff2.getName());
		System.out.println(staff2.getPay());
		
		// Alba
		Alba staff3 = new Alba("alice");
		staff3.setPayPerHour(1);
		staff3.setTimes(200);
		System.out.println(staff3.getName());
		System.out.println(staff3.getPay());
		
	}

}
