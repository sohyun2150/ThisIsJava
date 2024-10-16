package chapter06;

public class Quiz07_Parent {
	public String nation;
	
	public Quiz07_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Quiz07_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
