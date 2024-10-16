package chapter06;

public class Quiz07_ChildExample {

	public static void main(String[] args) {
		Quiz07_Child child = new Quiz07_Child();

		// 1. Quiz07_Child() 생성자 함수가 호출된다.
		// 2. Quiz07_Child 클래스의 this("홍길동");가 호출된다.
		// 3. Quiz07_Child(String name) 생성자 함수가 호출된다.
		// 4. 슈퍼 클래스를 상속받기 때문에 그 자리에 생략된 super(); [Quiz07_Parent()와 같음]가 호출된다.
		// 5. Quiz07_Parent 클래스의 this("대한민국");가 호출된다.
		// 6. Quiz07_Parent(String nation) 생성자 함수가 호출된다.
		// 7. 매개변수로 대한민국을 받아서 this.nation = nation;으로 연산된다.
		// 8. 그 아래에 있는 System.out.println("Parent(String nation) call");이 출력된다.
		// 9. Quiz07_Parent(String nation) 생성자 함수의 중괄호가 끝났으므로 그것을 부른 함수(Quiz07_Parent()) 자리로 돌아간다.
		// 10. 그 밑에 있는 System.out.println("Parent() call");이 출력된다.
		// 11. Quiz07_Parent() 생성자 함수의 중괄호가 끝났으므로 그것을 부른 함수(Quiz07_Child(String name)) 자리로 돌아간다.
		// 12. 매개변수로 홍길동을 받아서 this.name = name;로 연산된다.
		// 13. 그 밑에 있는 System.out.println("Child(String name) call");이 출력된다.
		// 14. Quiz07_Child(String name) 생성자 함수의 중괄호가 끝났으므로 그것을 부른 함수(Quiz07_Child()) 자리로 돌아간다.
		// 15. 그 밑에 있는 System.out.println("Child() call");이 출력된다.
		// 16. Quiz07_Child() 생성자 함수의 중괄호가 끝났으므로 그것을 부른 함수(Quiz07_ChildExample) 클래스의 Quiz07_Child();의 자리
		// 17. Quiz07_Child 클래스를 객체로 생성한다. (new 키워드 작동)
		// 18. 생성한 객체를 Quiz07_Child 클래스 형태를 가지는 레퍼런스 변수 child에 대입한다.
		
	}

}
