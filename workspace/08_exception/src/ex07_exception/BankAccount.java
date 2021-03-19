package ex07_exception;

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
	public void deposit(long money) throws DepositException {
		if(money <= 0) {
			throw new DepositException(money + "원은 입금 불가능"); // 예외 상황이다.
		} 
		balance += money;			
	}
	
	// 실제 출금된 금액을 반환하는 메소드
	public long withdraw(long money) throws WithdrawException { // long money : 요청금액
		if(money <= 0) {
			throw new WithdrawException(money + "원은 출금 불가능", 2000); // 예외 상황이다.
		} else if(money > balance) {
			throw new WithdrawException("잔액 부족", 2001); // 예외 상황이다.
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
		try {
			you.deposit(withdraw(money));
		} catch (DepositException e) {
			System.out.println(e.getMessage());
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
			System.out.println("예외코드 : " + e.getErrorCode());
		}
	}
	
	
	
}
