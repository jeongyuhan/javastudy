package ex01_array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// String[] friendList = {"타요", "짱구", "스폰지밥"};
		// 새로 사귄 친구의 수를 입력 받아서, 
		// friendList 배열의 길이를 늘리기

		Scanner sc = new Scanner(System.in);
		
		/*
		String[] friendList = {"타요", "짱구", "스폰지밥"};
		int newfriendList = 0;
		newfriendList = sc.nextInt();
		
		for(int nfl = 0;)
		*/
		
		
		// 선생님이 푼 해답)
		String[] friendList = {"타요", "짱구", "스폰지밥"};
		
		System.out.println("새로 사귄 친구가 몇 명?>>>");
		int newFriend = sc.nextInt();
		
		// 길이를 늘려줄 새로운 배열 생성
		String[] temp = new String[friendList.length + newFriend];
		
		// 새로운 배열로 기존 친구 명단을 넘겨준다.
		for(int i = 0; i < friendList.length; i++) {
			temp[i] = friendList[i];
		}
		
		// 새 친구들을 입력받는다.
		for(int i = friendList.length; i < temp.length; i++) {
			System.out.println("새 친구 이름>>>");
			temp[i] = sc.next();
		}
			
		// 새로운 배열로 갈아탄다.
		friendList = temp;
			
		// 확인 코드
		for(String friend : friendList) {
			System.out.println(friend);
		}
			
		sc.close();	
			
			
			
			
	}

}
