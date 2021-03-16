package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		
		// 배열은 reference type이다.
		//     -reference type은 주소를 저장할 때 쓰인다.
		
		int[] arr = new int[3];
		
		System.out.println(arr); // new int[3]을 통해서 생성된 배열 요소들의 주소가 저장되어 있다.
		// 결과 : [I@15db9742 --> @:at(~에 있는) , 15db9742:주소(참조)값
		
		
		// 배열의 길이를 조정하는(일반적으로 늘리는 작업) 코드이다.
		int[] a = {1, 2, 3};   // 배열 a이 길이는 3이다.  
		int[] b = new int[10]; // 배열 b의 길이는 10이다.
		
		// b[0] = a[0], b[1] = a[1], b[2] = a[2]
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];  // a = 1, 2, 3 
		}                 // b = 1, 2, 3, 0, 0, 0, 0, 0, 0, 0
		
		// a에는 {1,2,3}이 저장된 주소가 있다.
		// b에는 {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 있다.
		a = b; // a에는 {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 들어간다.
		// 이 경우 a{1,2,3} 데이터가 누수가 생긴다.자바에서는 이 누수된 데이터를 JVM이 알아서 제거한다. 이를 GC(Garbage Collection) 이라고 한다. 
		                                                        // Code : System.gc(); 코드를 실행해도 바로 작용되진 않는다.
		
		// 배열 a의 길이가 증가했다.
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

		
		
		
	}

}
