package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	// field
	private int bNo;
	private String title;
	private String writer;
	
	// method
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}

	/* 직접 작성한 hashCode() 와 equals()
	@Override
	public int hashCode() {
		// return title.length(); // title의 글자수가 같으면 같은 Board의 가능성이 있다.
	    return title.length() + writer.length(); // title의 글자수 + writer의 글자수가 같으면 같은 Board일 가능성이 있다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { // board1.equals(board1)
			return true;
		} 
		if(obj instanceof Board) {
			Board board = (Board)obj;
			return this.bNo ==board.bNo; // 게시글번호(bNo)가 같으면 같은 Board이다.
		} 
		return false; // board1.equals(member)
	}
	*/
	
	// 이러한 오버라이드 작업을 eclipse에서 자동으로 해준다.
	// [Source] - [Generate hashCode() and equals()...]
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
	
	
	
	
}

/*
	HashSet에 Board를 저장하고자 한다.
	동일한 Board의 경우 저장이 안되도록 설정해야 한다.
	
	1. 자바의 기본 동작
		1) 저장할 Board의 HashCode를 확인한다. (저장된 주소)
		2) 같은 HashCode를 가지고 있는 Board가 있는가? NO! (new를 통해 만들어지는 Board는 모두 다른 주소값을 가진다.)
		3) 따라서, 같은 Board는 없다고 판단한다.
		4) 자바의 기본 동작에 맡기면 무조건 저장된다.
		
	2. 추가해야 할 작업
		1) 같은 Board는 같은 HashCode를 가질 수 있도록 hashCode() 메소드를  오버라이드 한다.
		2) 같은 Board인지 비교할 수 있도록 equals() 메소드를 오버라이드 해준다.
		3) 같은 HashCode를 가지고, equals() 결과가 true이면 동일한 Board가 있다고 판단하므로 저장되지 않는다.
		
		
	====최종 결론====
	Hash 기반의 Collection framework(HashSet, HashMap 등)에 저장할 객체들은
	모두 [Source] - [Generate hashCode() and equals()...]를 추가해준다.
	그럼 중복을 모두 잡아준다.	
*/