package ex02_2d_array;

public class Ex02_2d_reference {

	public static void main(String[] args) {
	
		int[][] a = {
				     {1, 2},
				     {3, 4, 5, 6},
				     {7, 8, 9}
		            };
		
		System.out.println(a); // a[0], a[1], a[2] 3개 배열이 참조값이 모여있는 주소이다.
		
		System.out.println(a[0]); // a[0]는 {1, 2} 이다.
		System.out.println(a[1]); // a[1]은 {3, 4, 5, 6} 이다.
		System.out.println(a[2]); // a[2]는 {7, 8, 9} 이다.
		
		// 한마디로, 2차원 배열은 1차원 배열을 모아놓은 것을 말한다.
		
		System.out.println(a.length); // 3 (a[0], a[1], a[2])
		
		System.out.println(a[0].length); // 2 (1, 2)
		System.out.println(a[1].length); // 4 (3, 4, 5, 6)
		System.out.println(a[2].length); // 3 (7, 8, 9)
		
		
		// for문으로 순회
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}

}
