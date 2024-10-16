package chapter06;

public class Quiz06_Child extends Quiz06_Parent {
	public int studentNo;
	
	public Quiz06_Child(String name, int studentNo) {
		// 오류 원인 : 슈퍼 클래스가 호출되지 않았기 때문이다.
		// this.name = name; // 오류 수정 : 슈퍼클래스를 호출해서 슈퍼클래스의 생성자에 대입해서 바꾼다.
		super(name);
		this.studentNo = studentNo;
	}

}

