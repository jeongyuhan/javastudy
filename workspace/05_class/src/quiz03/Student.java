package quiz03;

public class Student {

	String name;
	int kor, eng, math;
	
	
	void set(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	double getAverage() {
		return (kor + eng + math) / 3.0;
	}
	
	String getPass() {
		return getAverage() >= 60 ? "합격" : "불합격";
		//return (kor+eng+math)/3 >= 60 ? "합격" : "불합격"; 두가지는 같은 코드이다.
	}
	
	
}
