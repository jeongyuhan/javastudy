package ex03_overloading;

public class MainClass {

	public static void main(String[] args) {

		// 직사각형을 만들어보자.
		Rectangle nemo1 = new Rectangle();
		nemo1.set(3, 4); // 너비3, 높이4
		System.out.println("넓이: " + nemo1.gerArea());
		
		// 정사각형을 만들어보자.
		Rectangle nemo2 = new Rectangle();
		nemo2.set(-100);
		System.out.println("넓이: " + nemo2.gerArea());
		
		
	}

}
