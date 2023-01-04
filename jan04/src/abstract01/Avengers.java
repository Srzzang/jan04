package abstract01;

import java.util.Iterator;

public class Avengers {

	public static void main(String[] args) {
		IronMan ironman = new IronMan();
		Hulk hulk = new Hulk();
		SuperMan superman = new SuperMan();
		
		ironman.attack();
		hulk.attack();
		superman.attack();
		
		// 한번에 공격 가능?
		Hero[] avan = new Hero[3]; //부모타입을 배열로 만듦
		avan[0] = ironman;  // 부모타입이더라도 생성은 IronMan
		avan[1] = hulk;
		avan[2] = superman;
		
		for (int i = 0; i < avan.length; i++) {
			avan[i].attack();
		}
		
		//다형성
	// 부모				자식
		Hero h1 = new IronMan(); // Hero에 없는 메소드는 나올수 없음 (아이언맨에 콜자비스있어도 출력X)
		h1.attack();
		h1.defense();
		
		((IronMan)(h1)).callJavis();
		((IronMan)(h1)).javis ="";
		
		IronMan h2 = (IronMan) h1;
		h2.callJavis();
		
		Object obj = new IronMan(); // 최상위 타입으로 변환은 가능하나 Object안에 메소드 없으므로 부를수있는건 없다
	
	/*다형성
	 * 다형성은 동적바인딩을 지원해야함.
	 * 
	 * 런타임때 최종 타입이 결정되는 것.
	 * 
	 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해서만 가능
	 * 
	 * 
	 * */
		
		
		
		
	}

}
