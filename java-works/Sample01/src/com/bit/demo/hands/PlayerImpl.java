package com.bit.demo.hands;

public class PlayerImpl implements Player{ //Impl :구현한 클래스 
	//서로 다른 두 시스템을 어떻게 붙일 것인지 제시하는 것이 인터페이스 

	@Override
	public int getHands() {
		return 3;
	}
}
