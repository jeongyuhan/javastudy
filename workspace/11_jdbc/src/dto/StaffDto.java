package dto;

import java.sql.Date;

// DB Table에 저장된 행(Row)을 저장하는 클래스
// VO  : Value Object
// DTO : Data Transfer Object
// 웹개발에선 JavaBean이라고도 한다.

// DB와 JAVA의 이름주는 것을 맞춰주는 것이 좋다.
// 테이블 칼럼			클래스 필드
// BOARD_NO				board_no 또는 boardNo
// BNO					bNo

// DTO/VO를 만들때 필수요소
// 디폴트 생성자 필수 (constructor를 만들지 않으면 자동으로 디폴트생성자를 사용할 수 있다. 만약 필드를 이용한 생성자를 만든다면 디폴트 생성자를 꼭 따로 만들어주어야한다.)
// getter/setter 필수

public class StaffDto {

	// field
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	// getter/setter
	// 데이터를 저장하는 용도이기 때문에 저장하고 꺼내올수있도록 모든 field값에 getter/setter를 만들어준다.
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "StaffDto [no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
	
	
}
