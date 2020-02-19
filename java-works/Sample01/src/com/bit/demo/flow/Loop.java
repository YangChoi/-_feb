package com.bit.demo.flow;

public class Loop {
	//iterator (반복가능한)
	//조건식 : 참인 동안, 이면 계속(연속)해서 실행
			
	public static void main(String[] args) {
		
		// 1.while문 (상태)
		int n = 0;
		while( !(0 < n && n < 10) ) { //본인이 참이 길 원하는 조건을 먼저 만들어 놓고 앞에 not을 붙이도록 
			// 반드시 멈춰야 한다.. > 조건식이 거짓이 되게 만들어야한다. 
			n += 1; // 증가를 시켜서 10보다 큰 경우를 만든다(거짓으로 만들어서 조건식이 멈추도록 한다)
			if( n % 5 == 0) { // 5로 나눈 나머지가 0이면 = 5배수 이면 
				break;  // 멈춰라 (바깥의 while문과 다르게 참이면 멈춘다)
			}
		}
		System.out.println(n);
		
		// 2. do-while 문
		// 키보드 입력 시 값의 범위. 유무를 확인 
		do {	
			n -= 2; // 한번 실행을 하고 밑의 while 조건에 따라 움직인다 
		}while( n > 0 );
		System.out.println(n);
		// 확인할 데이터가 있고 그에 대해 유효성검사를 할때 먼저 값을 입력받고 
		// 입력받은 데이터를 조건과 비교해보고 아니면 다시 돌아가서 다시 입력받음..
		
		
		// for문은 생략가능, 비워놓으면 참으로 보고 무한루프를 의미 > 하지만 무한루프안되게 끝나는 상황을 꼭 만들도록 
		// 번호: 정수값으로 구분할 수 있을 때 - 배열  
		for(int i = 0; i < 20; i+=2) { //초기식; 조건식; 증감식
			//무한 반복 금지 
			System.out.println(i);
		}
		// 1차 : for()
		// 2차 : for() { for() {} }
		// ㄴ 바깥에 있는 for를 행으로 보고 그 안에 있는 for문들을 열로 본다 
		
//		for( : ) {
//			//데이터 갯수만큼 실행 
//		}
	}

}
