package com.bit.demo.flow;
// 제어문 연습
// 1부터 25까지 연속하는 정수들을 출력 
// 목표 : 여러가지 방법을 찾는다
// 요구사항 : 5행 5열 형식 
// 줄바꿈(LF) : \n
// 하나의 행에서 첫번째로 옴(CR) : \r
public class Tutorial02 {

	public static void main(String[] args) {
		// 구구단 출력 3행 3열 형식으로 출력  
		// 화면에 출력할 결과를 생각해서 - 규칙성(한번기준), 변화를 찾아보자 (첫번째 할 때와 두번째 할 때랑 뭐가 다른가)
		int cols = 3;//옆으로 몇개씩 할거냐  (어지간 하면 변수를 잔뜩 만들자, 언제 변경사항이 생길 지 모르기 때문에)
		for(int m = 2; m < 9; m+=cols) { //블럭의 반복(3씩 증가하니까 2, 5, 8이기 때문에 9전까지 반복)
			for(int k = 1; k <= 9; ++k){
				for(int i = 0; i < cols; ++i){ //옆으로 갈 땐 옵셋(행 작업)
					int d = m + i; //d변수는 현재 중괄호 밖에서 사용할 수 없다 , 2를 기준으로 하나씩 옆으로 간다. 
					System.out.print(d+" x "+k+ " = " + (d*k));
					System.out.print("\t");
					
				}
				
				System.out.println(); //행작업이 끝나면 줄 바꿈 
	
			}
	
		}
		
	}
	
	
	public static void sample02() {
		//sample01();
		// 행렬곱, 합 
		int value = 1;
		for(int r = 0; r < 5; ++r) { // 행이 몇개임을 보여주는 for문(행의 시작)
			for(int c = 0; c < 5; c++) { //  (행이 할 일)
				System.out.print(value + "\t"); //(value가 안 for문 밖에 있을 경우) 변하는 것이 무엇이고(c), 변하지 않는 것(value)이 무엇인지 (어느 시점에서 어느 위치에서 변하는지 잘 볼 것) 
				value++;
			}
			//value++; //행이 끝나는 시점에 한 번 1증가 
			System.out.println(); //처리가 끝나면 행을 내리는 작업 (행이 끝나면 할 일) 
		}
		
//		int v = 1; 
//		
//		//단순한 방법으로 시작했다가 점점 생각을 더해가보기 
//		System.out.print("1 2 3 4 5\n");
//		System.out.print("6 7 8 9 10\n");
//		System.out.print("11 12 13 14 15\n");
//		System.out.print("1 2 3 4 5\n");
//		
//		System.out.println(v); //값이 변하는 규칙
//		v++;
//		if( 5개씩 ) {
//			System.out.println("\n");
//		}
//		 25까지 
		
//		****잘 보니 이거 for문 쓰면 되겠네?	
		
		int count = 0; 
		for(int v = 1; v <= 25;) {
			System.out.print(v + "\t");
			v++; //출력한 다음에 증가를 시켜야함
			count +=1;
			if( count == 5) { // v변수는 데이터 용도. 출력할 값  //각 행 당 5개를 출력하겠다는 것 (행마다 다른 갯수가 들어있다면 그런 행의 수 만큼 다른 조건을 만들어야할것)
				System.out.print("\n");
				count = 0; //0으로 초기화 : 증가하다가 5일 때 라는 조건이 여러번 되려면 5로 한번 된 뒤에 다시 한번 더 5보다 작게 만들어서 5가 되게 해야한다. 
					// ==라는 것은 한 번 뿐이라는 건데 나는 여러번 실행하고 싶으니 0으로 초기화하는 것 
			}
		}
	}

}
