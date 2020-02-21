package com.bit.demo.hands;

public class Main {

	public static void main(String[] args) {
		Player left = new PlayerImpl();
		Player right = new JangPlayer(); //인터페이스 : 함수를 만들지 않고 필요한것이 뭔지만 써놓음. (상속 : 완성된 클래스를 추가해서 확장 | 인터페이스 : 규칙을 알려줌) 
		//게임 : 가위바위보    
		
		//lv : left가 낸거 | rv : right가 낸거 
		int lv = left.getHands();
		int rv = right.getHands(); //내는 방식이 같기 때문에 같이 getHands() (게임의 룰 같은 것) -getHands가 뭘 낸다고 정한게 아니고 어떻게 내는 것인지를 정한 것
		//Override 개념이 적용되는 것 
		
		System.out.println(lv + ":" + rv );
	}

}
