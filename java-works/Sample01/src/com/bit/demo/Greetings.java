package com.bit.demo; //package는 경로를 의미
/*
 * 1 소스에 여러개의 class 
 * 단 public은 1개만 붙인다
 * 	-public class는 파일 명과 같아야 한다. (public이 없을 때는 상관없음) 
 */
public class Greetings {
	
//	'일을 할 수 있다' 라는 의미의 함수를 만들어줘야 실행이 가능
//	반환형  함수명(함수가 실행할 때 필요한 값이 있으냐 없느냐) {
//	}
	
//	클래스 안에 있는 함수 : 메서드  method 
// 	최초 실행을 의미한 메서드 규칙이 있다
	public static void main(String[] args) { //메인 메서드(실행을 위해 꼭 필요한 메서드)
		//모니터에 문자들을 출력하기 (어디에, 무엇을, 어떻게 할 것인지)
		System.out.println("Hello world!");
		//System이 직접 print한 것이 아니고 . 찍어서 out에게 일을 위임한 것이다..
		
		//기본형 : 소문자 
		//변수의 선언과 저장
		int n; //초기화되지 않은 상태 
		n = 100; //100을 받았다. (식 이라는 표현을 쓸 때는 연산자가 한개 이상인 경우) 
		//>>초기화 된 상태 (값을 저장한 상태)
		System.out.println(n); //main메서드에서 value(값)전달받음
		
		
		float f = (float) 10.0; //형변환casting, 이 때만 일시적으로 바뀐 것이고 이 문장 실행할 때만 잠깐이다. 
	}
	void todo() { //todo라는 메서드를 만들고 실행을 시키진 않은 형태
		
	}
	
	
	
	
}
