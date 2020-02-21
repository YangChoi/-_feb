package com.bit.demo.oop;
/*기존의 Phone을 베이스로 더 기능이 많아진 핸드폰 */
public class AdvPhone extends Phone { //상속 (Phone: 부모 AdvPhone: 자식)
//Phone의 기능을 확장한다.. 
//	private String number; //어차피 자식이나 부모나 양쪽의 것을 볼 수 없기 때문에 둘 다 필드 설정해도 똑같음 
	/*전화번호를 바꿀 수 있는 기능 */
	public void setNumber(String number) {
		//본 클래스의 필드에는 없지만 Phone의 필드에 number가 있음
		this.number = number;
		//getter setter를 하지 않는 한 private이면 자식클래스라도 사용할 수 없다. (에러)
	}
	
	/*부모 메서드에 있는 것을 호출하는 방식은 그대로 두고, 내부에서 실행되는 방법(내용),결과를 바꾸는 것 : 라이딩 쓰는 이유  */
	@Override 
	public void text() {
		System.out.println("====새로운 핸드폰 방식====");
	}
	
	@Override 
	public void rcv() {
		//호출하는 방법 그대로 
		// 실행 결과가 다르게 나옴 
		System.out.println(number + "...");
		System.out.println("전화 받기 ");
	}
	
	
}
