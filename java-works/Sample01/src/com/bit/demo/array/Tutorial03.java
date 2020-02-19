package com.bit.demo.array;
//두개의 정수를 받아서 비교해서 두개의 결과를 도출
//계산은 ballCount에서, 결과 출력은 main함수에서 
//결과 : 위치가 다른 3, 4 때문에 ball2 
public class Tutorial03 {
	public static int[] ballCount(int a, int b) { //100<=a, b<=999
		int[] count = new int[2]; //2개의 결과를 배열로 만들어 반환하자||번호정의>> [0] : Strike [1] : Ball 
		// 10진 정수 : 일, 십, 백
		// 정수 > []
		String as = String.valueOf(a); // "" +a 도 가능 (문자열 + 정수  = 문자열)
		char[] achar = as.toCharArray();
		
		String bs = String.valueOf(b);
		char[] bchar = bs.toCharArray();
		
		System.out.println(achar);
		System.out.println(bchar);
		
		 for(int ai = 0; ai < achar.length; ++ai) {
			 for(int bi = 0; bi < bchar.length; ++bi) {
				 if( achar[ai] == bchar[bi] ) {
					 if(ai == bi) { 
						 count[0]++; //Strike
					 }else {
						 count[1]++; //Ball
					 }
				 }
			 }
		 }
		return count; // 결과 반환(배열명 반환)
	}
	public static void main(String[] args) {
		
		int[] count = ballCount(345, 234); //비교할 두 정수 (첫번째 : 정답 | 두번째 : 정답을 비교하려고 데려온 애)
		System.out.println("Strike: " + count[0]);
		System.out.println("Ball: " + count[1]); 
		

	}

}
