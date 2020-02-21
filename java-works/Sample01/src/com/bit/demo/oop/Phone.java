package com.bit.demo.oop;

public class Phone {
// 전화번호, 통화를 할 수 있다. 
	protected String number; //protected : 우리 가족들만 쓸 수 있다  
	
	public void text() {
		System.out.println("====기존 핸드폰 방식====");
	}
	/*통화를 할 수 있다 */
	/*전화를 받다 */
	public void rcv() {
		System.out.println("전화 왔다");
	}
	/*전화를 걸다  */
	public void call() {
		System.out.println("전화를 걸고 있다");
	}
}
