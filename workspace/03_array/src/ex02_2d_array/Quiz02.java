package ex02_2d_array;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 구구단의 결과만 2차원 배열에 저장하고 출력하기
		// 2 4 6....18
		// 3 6 9....27
		// .........81
		
		/*
		int[][] ggd;
		for(int dan = 2; dan < 10; dan++) {
			for(int n = 1; n < 10; n++) {
				ggd = new int[dan][n];
				int result = 0;
				for(int i = 0; i < ggd.length; i++) {
					result = 0;
					for(int j = 0; j < ggd[i].length; j++) { 
						ggd[i][j] = (i+2)*(j+1);
						result += ggd[i][j];
					}
					System.out.println(result + " ");
				}
			}
		}
		*/
		
		
		// 선생님이 푼 해답)
		int[][] gugudan = new int[8][9];
		
		for(int i = 0; i < gugudan.length; i++) { // i는 dan과 관련
			for(int j = 0; j < gugudan[i].length; j++) {
				gugudan[i][j] = (i + 2) * (j + 1);
			}
		}
		for(int[] a : gugudan) {
			for(int n : a) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
		

	}

}
