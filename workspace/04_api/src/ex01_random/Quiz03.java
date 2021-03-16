package ex01_random;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 윷놀이
		// "도", 1칸 이동한다.
		// "개", 2칸 이동한다.
		// "걸", 3칸 이동한다.
		// "윷", "개", 6칸 이동한다.
		// "모", "모", "도" 11칸 이동한다.
		
		
		String[] yut = { "도", "개", "걸", "윷", "모"};
		int move = 0; // 이동 횟수
		
		while(true) {
			//윷을 프로그램이 던진다.
			int idx = (int)(Math.random() * 5) + 0; //인덱스 생성
			System.out.print("\"" + yut[idx] + "\""); // "도"~"모"출력 부문
			
			// 이동횟수 계산
			move += (idx+1); // ex) "도" 일경우, idx = 0이기때문에 move = 1 
			
			// 도, 개 , 걸은 끝낸다.
			if(idx < 3) {
				System.out.println("," + move + "칸 이동한다.");
				break;
			}
			else {// 윷, 모가 나온경우 다시 올라가서 실행한다.
				System.out.print(", ");
			}
		} 
		
		
		
		
		
 
	}

}
