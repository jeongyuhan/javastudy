package ex02_String;

public class Ex03_StringBuffer {

	public static void main(String[] args) {
		
		// java.lang.StringBuffer
		// 사용법과 목적은 StringBuilder와 똑같다.
		// thread에 따라서 무엇을 쓸 지가 달라지는 것이다.
		// 뭘 쓸지 모르겠을땐, StringBuffer를 쓰면된다.
		
		// 1. StringBuilder와 StringBuffer는 같은 일을 한다.
		// 2. StringBuilder는 single thread 환경에서 사용하고,
        //    StringBuffer는 multiple thread 환경에서 사용한다.
		//    (StringBuffer는 thread safe한 클래스이다.)
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		
		System.out.println(sb1.equals(sb2)); 

		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));
		
		
		
		
		
		
		
		
		
		
	}

}
