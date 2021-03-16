package ex07_recursive;

public class Calculator {
	
	
	
	// 역할 : n! 값 반환 (! = Factorial)
	// 3!(3Factorial) == 1 * 2 * 3
	public int getFactorial(int n) {
		//return 3 * 2 * 1;;
		if (n == 1) {
			return 1;
		} else {
			return n * getFactorial(n-1);
		}
	}
	
	// 재귀호출의 경우 반복문으로 바꿀 수 있다. 
	
	
}
