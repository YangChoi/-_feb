package com.bit.demo.oop;

/**클래스를 만든다는 것 
 * 1. 복합적인 자료형 새로 만든다. 
 * 2. 현실 모든 것을 추상적 개념화 ( 살아있다 ) 
 * - 클래스 : 연관성이 깊은 것들을 한데 모은 단위 
 * 	- 최소, 필수 정보, 처리를 모아라 
 * 	-	필요한 data 찾기 .. 
 * @author BIT02-09
 *
 */
public class A {
	/*필드*/
	// 접근자 : 사용권한, 범위 
	//public int a_num; 
	private int a_num;  // (default) int a_num (아무것도 입력하지 않았을 경우)-같은 패키지 안에 있을 때 사용가능 
				// public 붙혔을 시 : 패키지 달라도 사용 가능 
				// 하지만 모든 필드들은 private으로 지정할 것, private은 같은 패키지여도 안됨
	//기본 생성자 
	public A() {}
	public A(A origin) { 
		this.a_num = origin.getAnum();
	} 
		
	
	/*메서드*/
	//메서드는 public으로 처리 
	public int getAnum() {
		return a_num;
	}
	
	public int setAnum(int v) { //int v : 받을 값 
		return a_num = v;
	}
	
}
