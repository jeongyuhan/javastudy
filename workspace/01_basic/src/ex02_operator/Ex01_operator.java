package ex02_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
		// 1. 산술연산자 : +, -, *, /, %
		// 정수끼리 연산은 결과도 정수다.
		System.out.println(7 + 2); // 9
		System.out.println(7 - 2); // 5
		System.out.println(7 * 2); // 14
		System.out.println(7 / 2); // 3(몫), /는 몫을 구해준다.
		System.out.println(7 % 2); // 1(나머지) %는 나머지를 구해준다.
		
		// 실수끼리 연산은 결과도 실수다.
		System.out.println(7.0 / 2.0); // 3.5(나누기 연산)
		
		
		// 2. 증감연산자 : ++, --
		int a = 10;
		System.out.println(++a); // 11, a를 먼저 증가시키고 출력한다.
		System.out.println(a++); // 11, a를 먼저 출력시키고 증가시킨다.

		int b = 10;
		System.out.println(--b); // 9, b를 먼저 감소시키고 출력한다.
		System.out.println(b--); // 9, b를 먼저 출력시키고 감소시킨다.
		
		System.out.println(a + b); // 20, (10 + 10)이 아닌 (12 + 8)로 연산된 결과이다.
		
		
		// 3. 대입연산자 : =, +=, -=, *=, /=, %=
		// 문제) x와 y를 교환해보자.
		int x = 1;
		int y = 2;
		// 해결방안) 기본적은 교환 방법
		int temp = x; // x를 temp에 백업해둔다.
		x = y; // x는 y가 되었다.
		y = temp; // y는 백업해둔 x가 되었다. 
		System.out.println(x);
		System.out.println(y);
		
		// a += 1 : a = a+1 과 같은 의미
		// a -= 1 : a = a-1 과 같은 의미
		// a *= 1 : a = a*1 과 같은 의미
		// a /= 1 : a = a/1 과 같은 의미
		// a %= 1 : a = a%1 과 같은 의미
 		
		// 문제) money를 5% 증가시켜보시오.
		int money = 100;
		money += (int)(money * 0.05);
		//위 코드를 풀어서 설명하자면,
		//money = money + (int)(money*0.05);  실수 연산된 money의 5%를 casting하여 정수형으로 바꿔준다.        
		System.out.println(money);
		
		// 또다른 해결방안)
		// money *= 1.05; 
		
		
		
	}

}
