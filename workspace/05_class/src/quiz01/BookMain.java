package quiz01;

import java.sql.Date;
import java.util.Calendar;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.title = "어린왕자";
		book.writer = "생텍쥐베리";
		book.price = 12000;
		book.stock = 10000;
		Calendar date = Calendar.getInstance();
		date.set(2020, 0, 10);
		long timestamp = date.getTimeInMillis();
		book.pubDate = new Date(timestamp);
		book.isBest = true;
		
		System.out.println(book.title);
		System.out.println(book.writer);
		System.out.println(book.price);
		System.out.println(book.stock);
		System.out.println(book.pubDate);
		System.out.println(book.isBest?"베스트셀러":"일반서적");
		System.out.println("제목: " + book.title + ", 저자: " + book.writer + ", 가격: " + book.price + ", 재고: " + book.stock + ", 출판일: " + book.pubDate + ", " + (book.isBest?"베스트셀러":"일반서적"));
		
		
		
		
		
	}

}
