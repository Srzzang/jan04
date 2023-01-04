package abstract01;

public  class IronMan extends Hero{
	String javis;
	public void callJavis() {
		System.out.println("수트만들어");
		
	}
	@Override
	public void attack() {
		System.out.println("레이저 공격");
		
	}
	@Override
	public void defense() {
		System.out.println("방어");
		
	}
	
	
}
