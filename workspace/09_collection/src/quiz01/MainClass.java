package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제.
// 임의의 Member를 3명 저장하고, 
// 사용자로부터 회원번호를 입력받아서 해당 회원의 삭제를 진행하시오.

public class MainClass {

	public static void main(String[] args) {
		
		Member member1 = new Member(11111, "user1", new Date(System.currentTimeMillis()));
		Member member2 = new Member(22222, "user2", new Date(System.currentTimeMillis()));
		Member member3 = new Member(33333, "user3", new Date(System.currentTimeMillis()));
		
		List<Member> members = new ArrayList<Member>();
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 회원번호를 입력하세요 >>>>>>");
		int mNo = sc.nextInt();
		
		int removeIdx = -1; // 삭제할 회원의 인덱스 (존재하지않는 인덱스로 초기화)
		int length = members.size();
	
		for(int i = 0; i < length; i++) {
			// members.get(0) == member1
			if(members.get(i).getMNo() == mNo) {
				removeIdx = i;
				break;
			} 
		}
		if(removeIdx == -1) {
			System.out.println(mNo + " 회원번호를 가진 회원이 없습니다.");
		} else {
			members.remove(removeIdx);
			System.out.println(mNo + " 회원번호를 가진 회원의 정보를 삭제하였습니다.");
		}
		
		// Member 클래스는 toString() 메소드가 오버라이드 되어있으므로 
		// System.out.println(member1); 처럼 출력이 가능하다.
		System.out.println("한번에 확인 : " + members);
		System.out.println("순회 확인");
		for(Member member : members) {
			System.out.println(member);
		}
		
		
		
		
	}

}
