package dog;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	
	//1~45 숫자 6개를 뽑아주는 개
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>(); // 중복제거
		while (lotto.size() < 6) {
			lotto.add( (int)(Math.random() * 45) + 1);
		}
		return lotto;
	}
	
	@Override // 부모의 타입과 같아야함
	public void sound() {
		
		//super.sound(); 재정의 할거라 노필요
		System.out.println("멍");
		
		
	}
	public static void main(String[] args) {
		
	//	Animal ani = new Animal(); //추상 클래스라 객체 못만듭니다.
	//	ani.sound();
		
		Dog dog = new Dog();
		dog.age = 10;
		Human human = new Human();
		human.setSsn("931211");//저장
		System.out.println(human.getSsn());
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		
		System.out.println(dog.lotto()); //위의 두코드 대신 이렇게 해도됌
		
	}
}
