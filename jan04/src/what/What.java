package what;
//싱글톤
//인스턴스를 하나만 만들기 가능?
//ctrl + shift + L : 이클립스 단추키들 보기

public class What {

	public static void main(String[] args) {
		// static 안붙은 메소드는 객체 생성후에 실행해야합니다.
		// static 붙은 메소드는 객체 없이 클래스명.메소드명으로 실행
		
		Human h1 = Human.getInsetance();  //클래스명.인스턴스명
		Human h2 = Human.getInsetance();
		System.out.println(h1 == h2);
	}
	
}
//데이터베이스 연결할때 사용될 방법
class Human{
	private static Human human = new Human();
	
	private Human() { //생성자

	}
	
	public static Human getInsetance() {
		
		return human;
	}
	
}

