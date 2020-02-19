package com.bit.demo.array;
//자바 공부 여기서 https://www.bluej.org/
public class DimOne {

	public static void main(String[] args) {
		//정수 배열 1차 고정길이 : 넘으면 에러 
		int[] ar1 = new int[10]; // 20+5와 같은 수식으로도 표현가능
		System.out.println(ar1); //결과 : 타입@16진수 표기
		System.out.println(ar1.length); //배열의 길이 (전달체계로 사용하는 length)
		//ar1.length = 20; //대입 시도 : 에러 > 배열은 한번 생성 후에 동작 중에 변경(add,append) 불가(고정길이)
		//ar1[10] = 10; //코드를 입력했을 때는 괜찮은데 실행시키면 오류남..
		
//		for(int i = 0; i<ar1.length; ++i) {
//			System.out.println(ar1[i]); //배열 안에 i번 변수(요소)를 하나씩 처리 
//		}
//
//		for(int i = 0; i<ar1.length; ++i) {
//			System.out.println(ar1[9-i]); //배열 안에 i번 변수(요소)를 하나씩 반대로 처리 (임의접근)
//		}
		
		// 20개의 임의 정수(난수)들을 저장하라 >>여러개의 데이터를 어찌어찌 해라 : 배열 
//		int[] ran = new int[20];
//		for(int i = 0; i < 20; ++i) {
//			ran[i] = (int)(Math.random()*100); //임의의 정수를 저장
//			//random 해주는 수 단위가 작으니까 *100 해서 단위를 좀 올려준다 
//			Math.pow(a, b);
//			Math.sqrt(a);
//			//표준편차 (random과 함께 자주 쓰이는 pow, sqrt)
//		}
//		// 입력과 출력은 따로따로 하는 연습을 하자 (위 입력/ 아래 출력)
//		for(int i = 0; i < 20; ++i) {
//			System.out.print(ran[i]+" ");
//		}
		
		// 3자리 정수 2개를 비교해서 위치와 값을 판단하는 게임
		// 배열은 하나하나의 값을 번호로 지정해서 다룰 수 있기 때문에 위치반별하기에 좋다  
	}

}
