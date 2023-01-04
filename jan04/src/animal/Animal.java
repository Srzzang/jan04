package animal;
//추상 클래스(p329)
public abstract class Animal {
 // protected : 다른 패키지에서 자식 클래스의 접근 허용
	protected int age; 
	protected String name;
	
	//추상 메소드로 변신
	public abstract void sound(); //바디 없음
	//public abstract void add(); //강제
	
	
	public void eat() { // 바디가 있는 메소드
		System.out.println("먹이를 먹는다.");
	}
}
