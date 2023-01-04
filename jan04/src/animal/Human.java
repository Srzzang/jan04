package animal;

public class Human  extends Animal{
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	
	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		//-기호 빼기 replace : "-"를 ""로 교체
		ssn = ssn.replaceAll("-","");
		if(ssn.length() > 12) {
			this.ssn = ssn;
		}else {
			//모자란 자릿수만큼 *로 입력해서 저장하기
			this.ssn = ssn;
			for(int i =13-ssn.length() ; i<=13; i++) {
				this.ssn +="*";
			}
		}
	}


	int add(int num1, int num2){
		return num1 + num2;
	}

	
	@Override
	public void sound() {
	
		//super.sound(); 재정의해서 사용할거기떄문에 필요X
		System.out.println("자고싶다");
	}
	
	
	public static void main(String[] args) {
		Human human = new Human();
		Object h = new Human();  // 클래스 타입을 최상위 객체인 OBject로
	//	부모			자식

		Animal h2 = new Human();
	
		Human.check = 5000; // static 붙은 변수들은  클래스명.변수명
		//Human.NUM = 12345; final 이라 수정 불가
	
		int result = human.add(15, 30);
		human.ssn = "주민번호"; //메인메소드와 같은 클래스라 호출 가능
		human.setSsn("840411"); // 저장
		System.out.println(human.getSsn()); // 출력
	
	}
}
