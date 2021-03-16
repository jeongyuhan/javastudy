package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
		
		int choice = 3;
		 
		switch (choice) {
	    case 1: 
	    	System.out.println("1이다.");
	        break;
	    case 2: 
	    	System.out.println("2이다.");
	    	break;
	    default:	
	    	System.out.println("1과 2가 아니다.");
	    	//break;
		}
		
		// 설정한 choice 의 값에 따라 case choice값 : 에 따라 맞는부분이 출력된다.
		// 모든 case는 끝날때 마다 break를 넣어준다.
		// default는 만족하는 case가 없을 때 실행된다. 
		// default에는 break가 안들어가는게 좋다.
		
		// break는 switch문을 종료하겠다는 의미이다.
		// 따라서, default문은 switch문의 마지막에 들어가기 때문에 어차피 switch문이 끝나게된다.
		//       break로 끝내라고 명령을 할 필요가 없기 때문에 불필요한 break를 사용하지 않는게 좋다.
		
		// case를 끝내는 break를 사용하지 않으면 만족하는 키값을 찾고나서도 switch문을 끝내지않고 나머지 case부분을 처리하지않고,
		// case 조건이없어진 아래 명령메세지들이 모두 출력된다.
		// 이해가 안가면 break에 주석처리를 해놓고 출력해보자.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
