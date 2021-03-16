package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		
		// 1. 동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에 
		//    "apple"이 하나만 생긴다.
		String a = "apple";
		String b = "apple";
		System.out.println(a==b); // 참조비교(주소비교)를 해보면 같다고 나온다.
		
		// 2. new는 무조건 새로 만든다.
		//    "banana"는 2개가 있다.
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c==d); // 참조비교(주소비교)를 해보면 다르다고 나온다.
		
		// 3. 문자열의 길이는 length() 메소드로 구한다.
		System.out.println(a.length()); // "apple"의 길이 (글자수)
		
		// 4. 문자열의 일부를 추출하는 경우에는 substring() 메소드를 사용한다.
		//    1) substring(시작인덱스) : 시작인덱스 부터 끝까지 추출한다는의미
		//    2) substring(시작인덱스, 종료인덱스) : 시작인덱스 <= 추출한 문자열 < 종료인덱스 (범위중요)
		System.out.println(a.substring(0, 3)); // 0, 1, 2 인덱스 추출
		
		// 5. 문자열 양 옆의 공백문자(white space)를 제거하려면 trim() 메소드를 사용한다.
		String name = "     alice    ";
		System.out.println(name.trim()); // 공백은 지워지고 alice만 나온다.
		System.out.println(name.trim().length()); // 공백이 확실히 지워졌는지 길이를 구해보면 alice 5개만 나온다.
		
		// 6. 특정 문자를 찾는 경우에 indexOf() 메소드를 사용한다.
		//    찾고자하는 문자(문자열)의 인덱스를 반환한다.
		String str = "best of best of best";
		System.out.println("첫 번째 best의 인덱스: " + str.indexOf("best")); // 처음부터 best를 검색한다.
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", 4)); // 인덱스 4부터 best를 검색한다.
		System.out.println("두 번째 best의 인덱스: " + str.indexOf("best", str.indexOf("best")+1)); // 첫 번째 best의 위치를 구하고 +1로 그다음인덱스를 지칭해준다. 
		System.out.println("찾는 문자(열)가 없으면 " + str.indexOf("v") + "이 나타납니다."); // 없으면 -1이다.
		
		// 7. 뒤에서부터 검색하는 lastIndexOf() 메소드가 있다.
		System.out.println("마지막 bset의 인덱스: " + str.lastIndexOf("best"));
		
		// 8. 기존 문자를 새로운 문자로 변경하는 replace() 메소드가 있다.
		System.out.println(str.replace("b", "B")); // 모든 "b"를 "B"로 변경한다.
		System.out.println(str.replace("f" , "")); // "f"를 제거할 때 ""빈 문자열로 바꿔주면서 지워준다.
	
	}

}
