package com.bit.demo.oop;
//// 객체 지향 개념, 문법 - 독립적인.. 
//// 독립된 객체들의 조합 ( 연결 ) 하는 방법을 찾아라... 
public class Sample {
	//함수에서 함수로 전달한다.. > 복사해서 주니까 값의 변경 여부 
	public static void att(Object arg) {
		System.out.println(
				arg.getClass().getName() //클래스, 인스턴스들의 정보를 볼 수 있다 
				);
		if(arg instanceof AdvPhone) { //누구의 타입인지, 인스턴스인지 확인 할 수 있다 || arg는 AdvPhone타입 (AdvPhone으로 캐스팅 해도 되겠네?)
			System.out.println("true");
		}
	}
	public static void main(String[] args) {
//		A a = new A(); // 기본 생성자 
//		a.setAnum(3); // 3이라고 저장 
//		/*Sample에서만 A 인스턴스의 필드를 수정할 수 있게 하세요 */
//		B b = new B();
//		b.todo(new A(a)); // 복사 생성자 || 값을 b에게 넘겨줘야하는데 참조를 받게 되면 b 안에서 수정을 할 수 있는 여지가 생김. 그래서 a와 똑같은 것을 또 만들어서 사본을 주고 사본에서 
//		a = new A(a); //new는 마지막 new를 본다. 
//		A a2 = new A(a);
//		//다른 짓 하게 하고 원본을 우리가 가지고 있는다. 
//		System.out.println(a.getAnum()); // 3
//		System.out.println(a2.getAnum());

		

//		/*Sample에서 A를 사용한다.*/ 
//		A aInst = new A(); //A class의 변수 aInst //메모리 로딩 
//		aInst.a_num = 11; 
//		
//		A aInst1 = new A(); //메모리 로딩 // new로 이용해 각자 다른 값의 두개의 메모리를 생성한 것 
////		A aInst1 = aInst; //오른쪽 변수의 값을 왼쪽 변수에 저장하겠다 (같은 값을 가진 두개의 변수-복사)
//// 참조 복사, 값 복사 ... 
//		/*값 복사 */
//		aInst1.a_num = aInst.a_num; //이름은 같으나 참조가 다르다 (경로와 위치가 다르다면 이름이 같아도 다른 것)
//		aInst1.a_num++;
//		/*첫번째 인스턴스와 두번째 인스턴스 비교*/ 
//		System.out.println(
//				aInst.a_num + " vs " + 
//				aInst1.a_num
//				);
		
		/*Phone*/
		//여하튼 부모가 자식으로 형변환은 불가능하다! 
		//자식 타입인스턴스를 부모타입인스턴스으로 받을 수 있다. 
//		Phone p1 = new AdvPhone(); //실 생성 type이 뭔지 알 것!!
//		att(p1);
		//Object p1 = new AdvPhone(); >>가능.Object는 최상위 타입. 완전 단군할아버지 
//		p1.call();
//		p1.rcv();
//		p1.set
//		AdvPhone p2 = (AdvPhone)p1; //형변환 : p1 인스턴스 타입을 잠깐만 AdvPhone으로 바꾼다 (하나의 정보를 다양한 형으로 처리할 수 있다) 
		//인스턴스 하나를 다양한 형으로 다룰 수 있다 : 다형성 
		//p1은 처음부터  AdvPhone으로 생성했고 그걸 AdvPhone으로 바꾼 것이니까 원래대로 바꾼 것임 
//		p2.setNumber("23232323");
		
//		AdvPhone p2 = new Phone();
		//부모 타입 인스턴스는 자식 타입 인스턴스로 받을 수 없다. (에러)
		//Phone은 setNumber 없고, AdvPhone은 setNumber 있다. 
		//부모, 자식 간 다형성 
		
//		Phone p1 = new Phone();
//		//Sample p1.rcv();클래스에 전화번호를 저장할 수 없다(private) 
//		p1.text();
//		p1.rcv();
//		p1.call();
//		
//		// 만든 적 없음에도 바로 사용할 수 있다  (Phone에 만든 것은 그대로 유지한다)
//		AdvPhone p2 = new AdvPhone();
//		p2.text();
//		p2.setNumber("010-2345-1234"); /*전화번호 바꿀 수 있는 기능 */
//		p2.rcv();
//		p2.call();
		
	}

}
