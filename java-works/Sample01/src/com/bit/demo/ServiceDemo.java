package com.bit.demo;
/**
 * 설명용 **
 * 클래스 용법
 * @author BIT02-09
 *
 */
// 접근자 : public, private
public class ServiceDemo {
	// 필드 :private (별이야기가 없으면 필드는 전부 private으로 지정 - 안보이게 가린다(데이터보호)) 
	private int code; // private int code = 0; 코드 생성하는데 초기값 넣는 동작 하지 말것 (생성자에서 하자) - 명시적으로 만들어야한다 
	private String name;

	// 메서드 : public (별이야기가 없으면 메서드는 전부 public으로 지정 - 서로 같이 상호작용을 해야하니까 ) 
	@Override
	public String toString() {
		// 현재 인스턴스의 필드들을 문자열로 변환한다 
		// toString 이미 가지고 있는데 똑같은 것을 또 만드는 것 
		// Type@Address 출력되게 만드는 것 
		String s = "Service {"; //s에다 문자열 하나 넣어놓고 계속 연결시킴 
		s += "code : " + code + " , ";
		s += "name : " + name + "}"; //이로써 단순한 주소가 아니라 문자열이 출력이 됨 (필드들을 싹 모아서 문자열로 변환시켜서 처리) 
		return s; 
	}
//	//위의 것과 비교해보자
//	@Override //Override : 새로 만드는 것(함수를 교체한다) || Overload : 똑같은 걸 여러개 만드는 것 
//	public String toString() {
//		
//		return super.toString();
//	}
//	
	// 생성자 : VM에서 자동으로 만들어줌 
	public ServiceDemo() { //기본 생성자 
		// 생성자랑 일반 메서드랑 구분하자. 생성자는 반환형 필요 없다. 
		// 인스턴스에 대한 초기화 동작을 만듦(위에 있는 필드들의 초기값들을 넣는 일) 
		code = 0; 

	}
	//메서드를 만들다 보면 똑같은 것을 여러개 만들어야할 때가 있다. 
	//Overload : 똑같은 것을 여러개 만든다 (함수명 같고, 매개변수 다름) 
	public ServiceDemo(int code, String name) {
		this.code = code;
		this.name = name;
		
	}

	//getter , setter  : 필드값을 반환, 저장하는 처리 (필드가 많아질 수록 게터세터 많아짐) 
	//get쓰고 필드명 적음(첫글자는 대문자)
	//getter는 필드의 값을 빼오는 것이기 때문에 필드의 값을 그대로 쓴다.(필드가 int면 게터도 int)
	public int getCode(){ //나한테 있는 피드 값을 반환해주는 것 :return  
		return code; 
		
	}
	//setter중에 반환값이 클래스명이나 타입형태인 경우도 있다 
	public void setCode(int code){ //저장 : 대입연산 || 괄호 안 : 저장할 값
		// 검사 : setter는 다른 어디로 부터 데이터를 받아 자신에게 저장을 하는 동작을 하는 것이기 때문에 검사를 해야한다 
		this.code = code; //this : 예약어 || 같은 code code니까 헷갈리니까 구분한다고 씀 (이름을 다르게 하면 안써도 됨)
		//this : 현재(본 메서드-setCode가 호출하는 때) 인스턴스를 의미 
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
