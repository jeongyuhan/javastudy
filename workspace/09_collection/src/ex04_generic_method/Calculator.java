package ex04_generic_method;

public class Calculator {

	// method
	public <T> double getTotal1(T[] a) {
		double total = 0.0;
		for(int i = 0; i < a.length; i++) {
			total += ((Number)a[i]).doubleValue();
		}
		return total;
	} 
	
	public <T extends Number> double getTotal2(T[] a) { // T는 Number를 상속받는 클래스만 가능하다는 의미.
		double total = 0.0;
		for(int i = 0; i < a.length; i++) {
			total += a[i].doubleValue();
		}
		return total;
	}
	
	
}
