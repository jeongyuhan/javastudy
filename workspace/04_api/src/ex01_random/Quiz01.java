package ex01_random;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 임시비밀번호 발급하기
		// 영문대문자 + 아라비아숫자 6자리
		// 약 5:5 비율

		// charSet에 추가해놓으면 편하게 빼서 사용이 가능하다.
		char[] charSet = {
						  '0', '1', '2', '3', '4', '5',
					      '6', '7', '8', '9', 'A', 'B',
					      'C', 'D', 'E', 'F', 'G', 'H',
					      'I', 'J', 'K', 'L', 'M', 'N',
					      'O', 'P', 'Q', 'R', 'S', 'T',
					      'U', 'V', 'W', 'X', 'Y', 'X'
		};
		
		// 방법1
		
		// 비밀번호를 생성하는 요소로 인덱스를 랜덤하게 생성한다.  0 <= random < charSet.length
		String tempPw = "";
		for(int n = 0; n < 6; n++) { // 6번 반복하겠다는 의미(비밀번호 6개의 문자를 만들기위한 사용)
			int idx = (int)(Math.random() * charSet.length) + 0; // charSet안에 있는 인덱스를 사용하여 비밀번호를 뽑아준다. 시작점은 0부터가 초기값이기 때문에 생략가능
			tempPw += charSet[idx]; // tempPw에 6번 반복한  charSet[idx]를 누적시켜 더해준다.
		}
		System.out.println(tempPw);
		
		
		// 방법2 (charSet[]을 생성하지 않고 코드 구성하는 방법)
		// 문자	==	정수
		// '0'	==	48 ('0' ~ '9' == 48 ~ 57)
		// 'A'	==	65 ('A' ~ 'Z' == 65 ~ 90)
		// 'a'	==	97 ('a' ~ 'z' == 97 ~ 122)
		
		String tempPw2 = "";
		for(int n = 0; n < 6; n++) {
		if(Math.random() < 0.5) {
			int arabia = (int)(Math.random() * 10) + '0';	// 0~9 사이중 랜덤으로 1개
			tempPw2 += (char)arabia;
		} else {
			int alphabet = (int)(Math.random() * 26) + 'A';	// 'A'~'Z' 사이중 랜덤으로1개 
			tempPw2 += (char)alphabet;
			}
		}
		System.out.println(tempPw2);
		
		
	}

}
