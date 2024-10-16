package chapter06;

public class Quiz07_Child extends Quiz07_Parent {
	public String name;
	
	public Quiz07_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Quiz07_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}

}
