/*
 *  필요한 데이터가 무엇이 있는가, 어떤 계산이 필요한가에 대해서 계속 생각
 */
package com.bit.demo;

import java.util.Scanner; 

/*
 * 실습. 요금 계산하기
 * 상황. 주차장에 주차한 시간을 계산해 요금을 받는 프로그램
 * 요구사항
 * 1. 기본요금 : 5000원
 * 2. 10분당 : 500원 가산
 * 3. 콘솔 입출력 환경에서 실행
 */
public class Tutorial01 {
	
	static Scanner sc = new Scanner(System.in); //필드는 메서드들이 그대로 사용할 수 있다. 
	//main안의 지역변수 안은 어디있는지 알려주면서 사용해야한다 
	
	//static 함수(정적함수) 그 안에서 사용하려면 사용하려는 대상이 static이여야함(static함수는에선 static함수만 호출할 수 있다 )
	public static void main(String[] args) {
		//scanner는 main쪽에서 한번만 만들고 그것을 전역을 쓰던 전달을 하든 해서 쓰자 
		//Scanner sc = new Scanner(System.in); //scanner가 직접 입력을 처리하는 것이 아니라 키보드에서 입력된 값을 받아서 원하는 형으로 바꾸는 역할을 함(입력기 아닌 변환기)
		//그래서 밑의 getTime() 안에 sc을 넣어 알려주자니.. 너무 일이 많으니 그냥 main 밖에 만들어서 모두가 쓸 수 있게 하자 
		
		// 들어온 시간 입력 : 시:분 0000(두자리씩 끊어서)
		int in = getTime();
		// 나가는 시간 입력
		int out = getTime();
		// 시간 차 구하기 
		int diff = diffTime(in, out); //in, out 순서 잘 지키기
		// 요금 계산하기 
		double price = getPrice(diff);
		 
		System.out.println("price : " + price);
	}
	
	static int getTime() {
		//시간을  main에게 반환
		int t = 0;
		t = sc.nextInt(); //scanner를 안쓰면 직접 계산을 해야하니까.. 좋은 lib를 쓰자
		//main이 가지고 있기 때문에 다른 함수에서는 보이지 않아 에러가 난다. 그렇기 때문에 main안에 있다고 알려줘야한다 (함수(변수)의 지역성)
		return t; 
	}
	
	static int diffTime(int in, int out) {
		//main이 가진 시간 두개를 받음
		
		return out - in;
	}
	
	//연습을 위해 요금은 double로
	static double getPrice(int diff) {
		double price = 0.0; 
		return price;
	}

}
