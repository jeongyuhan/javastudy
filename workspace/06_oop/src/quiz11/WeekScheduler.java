package quiz11;

import java.util.Scanner;

public class WeekScheduler {

	// field
	private int nthWeek;
	private Day[] week; // 스케줄을 저장하기 위한 용도
	private String[] weekNames = { "일", "월", "화", "수", "목", "금", "토" }; // 스케줄을 저장할 요일을 찾는 용도
	private Scanner sc = new Scanner(System.in);

	// constructor
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		week = new Day[7];
		for (int i = 0; i < week.length; i++) {
			week[i] = new Day();
		}
	}

	// method

	// 1. run()
	public void run() {
		while (true) {
			menu();
			System.out.println("작업 선택 >>>>");
			int choice = sc.nextInt();
			sc.nextLine(); // choice입력 뒤에 남아있는 enter를 제거하기위한코드 (제거하지 않으면 다음에 스케줄을 만들때 사용되어 문제가 생긴다.)
			switch (choice) {
			case 1: makeSchedule();	break;
			case 2:	deleteSchedule(); break;
			case 3:	updateSchedule(); break;
			case 4:	searchSchedule(); break;
			case 5: printAllSchedule(); break;
			case 0:	exit();	return; // exit()에서 break를 할 필요없이 run() 메소드를 끝내는 return을 사용해준다.
			default: System.out.println("없는 작업입니다. 다시 입력하세요.");
			}
		}
	}

	// 2. menu()
	public void menu() {
		System.out.println("======스케줄러======");
		System.out.println("1. 스케줄 만들기");
		System.out.println("2. 스케줄 삭제하기");
		System.out.println("3. 스케줄 수정하기");
		System.out.println("4. 스케줄 조회하기");
		System.out.println("5. 전체 스케줄 보기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("====================");
	}

	// 3. exit()
	public void exit() {
		System.out.println("스케줄러를 종료합니다.");
		sc.close();
	}

	// 4. makeSchedule()
	public void makeSchedule() {
		System.out.println("===스케줄 만들기===");
		System.out.println("스케줄을 등록할 요일(일~토)을 입력>>>>");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1); // 화요일을 "화" 가 아닌 "화요일" 이라고 입력을 했다면 substring(0, 1)을 사용하여 첫번째 글자만 인식해준다.
		sc.nextLine(); // 요일 입력 뒤에 남아있는 enter를 제거
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일의 신규 스케줄>>>>");
					String schedule = sc.nextLine();
					week[i].setSchedule(schedule);
					System.out.println(weekName + "요일에 신규 스케줄이 저장되었습니다.");
				} else {
					System.out.println(weekName + "요일은 이미 스케줄이 있습니다.");
				}
				break; // for문을 끝내는 용도
			}
		}
		System.out.println(weekName + "요일은 존재하지 않습니다.");
	}

	// 5. deleteSchedule()
	// 여기선 입력을 받는 메소드가 next() 밖에없기 때문에 enter를 받아줄 nextLine()을 사용할 필요가 없다.
	public void deleteSchedule() {
		System.out.println("===스케줄 삭제===");
		System.out.println("스케줄을 삭제할 요일(일~토)을 입력>>>>");
		String weekName = sc.next(); // 화요일을 "화" 가 아닌 "화요일" 이라고 입력을 했다면,
		weekName = weekName.substring(0, 1); // 0 <= 추출할문자 < 1 따라서, 인덱스 0 만 출력한다. // charAt(0)으로는 String타입인 week를 사용할 수
												// 가 없다.
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 스케줄이 없습니다.");
				} else {
					System.out.println(weekName + "요일의 스케줄은 다음과 같습니다.");
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.println("삭제하시겠습니까?(Y/N)>>>>");
					String yesNo = sc.next();
					yesNo = yesNo.substring(0, 1);
					if (yesNo.equalsIgnoreCase("Y")) {
						week[i].setSchedule(null); // 삭제하는 방법은 저장했던 스케줄을 null값으로 다시 초기화 시켜놓는다는 의미이다.
						System.out.println(weekName + "요일의 스케줄이 삭제되었습니다.");
					} else {
						System.out.println("삭제가 취소되었습니다.");
					}
				}
				break;
			}
		}
		System.out.println(weekName + "요일은 존재하지 않습니다.");
	}

	// 6. updateSchedule()
	// 있으면 수정, 없으면 새로 등록
	public void updateSchedule() {
		System.out.println("===스케줄 수정===");
		System.out.println("스케줄을 수정할 요일(일~토)을 입력>>>>");
		String weekName = sc.next();
		sc.nextLine();
		weekName = weekName.substring(0, 1);
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 스케줄이 없습니다.");
					System.out.println("새로운  스케줄을 입력하시겠습니까?(Y/N)>>>>");
					String yesNo = sc.next();
					sc.nextLine(); // 입력된 enter 정리 (아래에서 nextLine을 사용하기 때문에)
					if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y') { // charAt()을 사용하면 대소문자 구분이 안되기 때문에 따로
																			// 입력해줘야된다.
						System.out.println(weekName + "요일의 신규 스케줄 입력>>>>");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + "요일에 신규  스케줄이 저장되었습니다.");
					} else {
						System.out.println("스케줄 수정이 취소되었습니다.");
					}
				} else {
					System.out.println(weekName + "요일의 스케줄을 확인하겠습니다.");
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.println("스케줄을 수정하시겠습니까?(Y/N)>>>>");
					String yesNo = sc.next();
					sc.nextLine();
					if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y') {
						System.out.println(weekName + "요일의 수정 스케줄 입력>>>>");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + "요일의 스케줄이 수정되었습니다.");
					} else {
						System.out.println("스케줄 수정이 취소되었습니다.");
					}
				}
			}
		}
		System.out.println(weekName + "요일은 존재하지 않습니다.");
	}

	// 7. searchSchedule()
	public void searchSchedule() {
		System.out.println("===스케줄 조회===");
		System.out.print("스케줄을 조회할 요일(일~토)을 입력>>>>");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1); // charAt()을 사용할 경우 : weekName.charAt(0) + "";
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				System.out.println(weekName + "요일의 스케줄입니다.");
				week[i].info();
				return; // searchSchedule() 메소드를 종료
				} 
		}
		System.out.println(weekName + "요일은 존재하지 않습니다."); // for문을 만족하지 않는 값을 입력하면 for문으로 들어가지를 못하기 때문에 for문의 밖에서 처리한다.
	}


	// 8. printAllSchedule()
	public void printAllSchedule() {
		System.out.println("===" + nthWeek +"주차 전체 스케줄===");
		for(int i = 0; i < week.length; i++) {
			System.out.println(weekNames[i] + "요일 스케줄 : ");
			week[i].info();
		}
	}

	
	
	
	
}