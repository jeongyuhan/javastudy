package quiz01;

// SalseMan을 Staff밑에 만들면 salary를 다시줘야하기 때문에 SalaryMan 밑에 만드는 것이 좋다.
public class SalesMan extends SalaryMan{
	
	// field
	private int salesAmount; // 판매실적
	private double insentive; // 인센티브(%)

	// constructor
	// 판매사원을 뽑을 때 판매 실적이 정해져 있지 않고, 판매실적에 따라 인센티브도 달라지기 때문에 사용하지 않고 생성자를 만든다.
	// 따라서, SalesMan의 field는 사용하지 않고, SalaryMan의 생성자만 따와서 생성자를 생성해야 하기 때문에
	// Source - Generate Constructors from Superclass 를 이용해 만들어준다.
	public SalesMan(String name, int salary) {
		super(name, salary);
	}

	// method
	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(salesAmount > 1000) {
			setInsentive(0.07); // 7% 인센티브
		} else {
			setInsentive(0.05); // 5% 인센티브
		}
	}

	public double getInsentive() {
		return insentive;
	}

	public void setInsentive(double insentive) {
		this.insentive = insentive;
	}
	
	public int getSalesPay() {
		return (int)(salesAmount * insentive);
	}
	
	
	@Override
	public int getPay() {
		//return 기본급 + 판매수당(판매실적 * 인센티브);
		return super.getPay() + getSalesPay();
	}
	
	
	
	
	
}
