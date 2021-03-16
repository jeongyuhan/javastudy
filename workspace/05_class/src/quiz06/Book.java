package quiz06;

public class Book {

	String title;
	String writer;
	int price;
	
	Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	Book(String title, int price) {
		this(title, "미상", price);
	}
	
	Book() {
		this("없음", "미상", 0); // 인수가 3개짜리를 불러서 호출해내는 방법
		//this("없음", 0); // 인수가 2개짜리를 호출한뒤 2개짜리에서 3개짜리를 호출해내는 방법("미상"을 다시 안적어도 된다는 특징이 있다.)
	}
	
	
	void info() {
		String bInfo = "제목: " + title + ", 저자: " + writer + ", 가격: " + price + "원";
		System.out.println(bInfo);
	}
	
	
}
