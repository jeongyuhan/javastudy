package ex02_2d_array;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1. 인구 조사
		// apt에 사는 사람 수를 초기화 해 놓고,
		// 전체 사람의 수를 출력하기
		// 1층에 3명이 삽니다.
		// 2층에 7명이 삽니다.
		// 3층에 6명이 삽니다.
		// 4층에 5명이 삽니다.
		// 5층에 7명이삽니다.
		// apt에 28명이 삽니다.
		
		// 5개층 아파트
		// 층별 2개 호
		int[][] apt = {
				{1, 2},
				{5, 2},
				{3, 3},
				{1, 4},
				{5, 2}
				};
		
		/*
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				
			}
		}
		for(int i = 1; i < apt.length; i++) {
			for(int j = 1; j < apt[i].length; j++) {
				int total = apt[i][j]; 
				System.out.print(total);
			}
			System.out.println();
		}
		*/
		
		// 선생님이 푼 해답)
		int floor = 0; // 각 층마다 사는 사람들의 합계
		int total = 0; // apt 전체에사는 사람들의 합계
		
		for(int i = 0; i < apt.length; i++) { // i는 층을 의미
			floor = 0; // floor의 초기화가 안에서 한번더 이뤄지지않으면 층을 옮길 때마다 중첩되서 값이 더해진다.
			for(int j = 0; j < apt[i].length; j++) { // j는 호를 의미
				floor += apt[i][j];
			}
			System.out.println((i+1) + "층에는 " + floor + "명이 삽니다.");
			total += floor;
		}
		System.out.println("apt에 " + total + "명이 삽니다.");
		
		
	}

}
