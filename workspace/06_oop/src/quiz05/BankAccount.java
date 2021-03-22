package quiz05;

public class BankAccount {

	// field
	private String accNo;
	private long balance;

	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// method
	public void deposit(long money) {
		if(money <= 0) {
			System.out.println(money + "원은 입금 불가능");
			return; 
		} 
		balance += money;			
	}
	
	// 실제 출금된 금액을 반환하는 메소드
	public long withdraw(long money) { // long money : 요청금액
		if(money <= 0) {
			System.out.println(money + "원은 출금 불가능");
			return 0;
		} else if(money > balance) {
			System.out.println("잔액 부족");
			return 0;
		} 
			balance -= money;
			return money;
	}
	
	public void inquiry() {
		System.out.println("계좌번호: " + accNo + "(" + balance + ")");
	}
	
	public void transfer(BankAccount you, long money) {
		// 내돈은 줄어든다.(출금)
		// withdraw(money);
		// 네돈은 늘어난다.(입금)
		// you.deposit(money);
		
		// 내 통장에서 출금된 금액을 네 통장에 입금해준다.
		you.deposit(withdraw(money));
	}
	
	
	
}
