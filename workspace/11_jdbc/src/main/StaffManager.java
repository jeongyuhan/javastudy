package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	// method
	public void menu() {
		System.out.println("==============사원 관리프로그램=================");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 검색");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("================================================");
	}
	
	public void execute() {
		while(true) {
			menu();
			System.out.print("선택(1 ~ 6) >>>>");
			switch(sc.nextInt()) {
			case 1 : insertStaff(); break;
			case 2 : updateStaff(); break;
			case 3 : deleteStaff(); break;
			case 4 : selectOne(); break;
			case 5 : selectList(); break;
			case 6 : System.out.println("프로그램을 종료합니다.");
					 return;
			default : System.out.println("다시 선택하세요.");
			}
		}
	}
	
	public void insertStaff() {
		System.out.print("신규 사원 이름 >>>>" );
		String name = sc.next();
		System.out.print("신규 부서명 >>>>");
		String department = sc.next();
		StaffDto staffDto = new StaffDto(); // 입력한 값을 set해줄 StaffDto 객체 생성
		int no = dao.selectMaxNo(); // 가장 최근에 등록된 번호를 알아내고
		staffDto.setNo(no + 1); 	// 새로 추가되는 사원에게는 가장 최근에 추가된 사원번호+1 값을 부여한다.
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto); //DB에 삽입, StaffDto에 저장한 필드들을 Dao에게 넘겨주어 DB에 삽입한다.
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}
	
	public void updateStaff() {
		System.out.print("수정할 사원 번호 입력 >>>>");
		int no = sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);
		System.out.println("수정할 내용을 선택하세요(1: 이름, 2: 부서) >>>>");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.print("새로운 사원 이름 입력 >>>>");
			String name = sc.next();
			staffDto.setName(name);			
		} else if(choice == 2) {
			System.out.print("새로운 부서 입력 >>>>");
			String department = sc.next();
			staffDto.setDepartment(department);			
		} else {
			System.out.println("잘못된 선택입니다.");
			return;
		}
		int result = dao.updateStaff(staffDto);
		System.out.println(result + "명의 사원정보가 수정되었습니다.");
	}
	
	public void deleteStaff() {
		System.out.print("삭제할 사원 번호 입력 >>>>");
		int no = sc.nextInt();
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		int result = dao.deleteStaff(staffDto);
		System.out.println(result + "명의 사원이 삭제되었습니다.");
	}
	
	public void selectOne() {
		System.out.print("조회할 사원 번호 입력 >>>>");
		int no = sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);
		if(staffDto == null) {
			System.out.println("사원 번호" + no + "를 가진 사원이 없습니다.");
		} else {
			System.out.println(staffDto);
		}
	
	}
	
	public void selectList() {
		List<StaffDto> staffList = dao.selectList();
		System.out.println("총 사원 수 : " + staffList.size() + "명");
		for(StaffDto staffDto : staffList) {
			System.out.println(staffDto);
		}
	}
	
	
	
	
	
	
}
