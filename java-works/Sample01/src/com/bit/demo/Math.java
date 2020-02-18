package com.bit.demo;

public class Math {

	public static void main(String[] args) {
		//논리가 여러개 조합, 비교 
		//XOR : 논리연산이 아닌 비트연산 bit-wise(다르면 1 같으면 0. 반전, 암호/복호)
		//System.out.println( (3+2)&&(3+3) );//논리연산자는 값이 아닌 노리가 나와야하기 때문에 안에 산술을 넣으면 안된다.  //and
		System.out.println((3>2) && (4<9)); //왼&오 모두 참일 때만 참. 하나라도 거짓이면 거짓
		System.out.println((3>2) || (4<9)); //하나라도 참이면 참, 둘다 거짓이면 거짓 //or
		System.out.println(!(3>2)); //not연산
		
		//논리연산자 : 값 간의 크기를 비교 > 논리  boolean : true, false
		//조건식 : 선택적인 실행 
		System.out.println( 10 < 5 ); //f
		System.out.println( 10 <= 5 ); //f
		System.out.println( 10 > 5 ); //t
		System.out.println( 10 >= 5 ); //t
		System.out.println( 10 == 5 ); //f
		System.out.println( 10 != 5 ); //t
		
		//**유일값 : 식별값 유의할 것
		
		
/*		//산술 연산자: 결과값 * %(나머지 : 배수판별 뿐만 아니라 범위 구할때도 사용)
		int a = 3;
		int b = 1;
		int c = 4;
		int num;
		num = a + b + c;
		num = 0;
		//하나하나씩 단계별로 더해가는 과정 : 누적
		num = num + a; //num += a;
		num = num * b;
		num = num / c;  //zero
		System.out.println(num);
		
		int min = 1;
		int max = 100;
		//int num2= 100 % 10; // 0 ~ 9 
		//얼마보다 큰 값이 나오면 안될 때와 같이 범위를 지정할 때 사용
		//int num2 = 100 % ('a' ~ 'z') + 'a';
		//비밀번호 찾을 때 임의의 알파벳을 선정할 때. 문자를 숫자로 봐봐
		//int num2 = Random % (max) + min;
		//random이 어떤값이던 간에 max-1(나머지) 99이다. 거기서 min 1을 더하면 100
*/
	}

}
