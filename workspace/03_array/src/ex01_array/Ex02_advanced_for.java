package ex01_array;

public class Ex02_advanced_for {

	public static void main(String[] args) {
		
		// advanced-for : 향상 for문
		// 배열의 순회를 인덱스 없이 처리하는 for문이다.
		
		int[] arr = {10, 20, 30};
		
		for (int n : arr) { // arr 배열의 모든 요소를 변수 n으로 하나씩 전달하는 방식
			System.out.println(n);
		}

		// 모든 배열의 요소를 1 증가시키고자 한다면
		// arr[0]++, arr[1]++, arr[2]++
		for (int n : arr) {
			n++; // arr 배열의 요소가 증가했는가? NO			
		}		 // 변수 n은 arr배열이 아니라 배열의 값을 가져오는 다른 변수이기 때문에 배열의 요소를 수정할 수 없다. 
		
		// advanced-for문은 배열의 요소를 수정할 수는 없다.
		// 인덱스를 활용하는 일반 for문이 배열의 요소를 수정할 수 있다.
		for(int i = 0; i < arr.length; i++) {
			arr[i]++;
			System.out.println(arr[i]);
		}
		
	}

}
