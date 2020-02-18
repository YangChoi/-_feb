package com.bit.demo;

import java.io.IOException;

public class Echo {

	public static void main(String[] args) throws IOException { //IOException : 입출력 검사
		int key; //키보드로 입력받는 값은  byte로 형태를 보면 정수다 
		key = System.in.read(); //키보드에서 가져오기 , error : 보안상의 이유로 입력받을 때 들어오는 것을 잘 검사를 해야한다(예외처리)
		//throw : 다른애가 검사하게 던져버림
		//try catch : 내가 한 번 해볼게 
		System.out.println(key); //int로 들어와 String으로 나감
		//입력한 단어의 제일 첫번째 문자의 아스키코드 알려줌
	}

}
