package com.bit.demo.carpark;

import java.util.Scanner; 
//Maven > Spring의 기본설정 
//코딩보단 설정이 더 중요하다!
//안드로이드는 gradle

import com.bit.demo.carpark.model.Car;
//패키지가 다르기 때문에 import 됨(하위라고 해서 다 읽히는 것은 아님) 

/**
 * 파란색 주석이랑 초록색 주석이랑 다르다. 
 * 파란주석에는 코드에 대한 설명을 적는다. 
 * 간단히 어떤 구성이고, 누가 작성했는지 정도...
 * 
 * Java 프로그래밍의 시작은 class를 만드는 것 부터..
 *  -클래스 {필드, 메서드}
 *  -메서드 : 함수 - 동작, 처리 
 *  -필드 : 메서드에서 처리할 자료 (data)
 *  @author BIT02-00
 *  
 */

public class BootApp {
/**
 * 콘솔 환경에서 실행하기 위한 시작함수 - main
 *  -public :공개
 *  -static : 정적, 클래스 멤버, 클래스 명.main()으로 사용가능
 *  -void : 없음, 반환없음
 *  
 * 콘솔 입출력 담당 
 * @param args : 문자열 여러개(배열)
 * @return
 */
	public static void main(String[] args) {
		/* 메서드는 특별한 일 없으면 대부분 public
		 *static이 붙은 메서드나 필드는 클래스 명에다가 그대로 (인스턴스를 생성하지않고) 점 찍어서 사용할 수 있다  <> static 없는 애들은 인스턴스부터 만들어서(new키워드)사용해야한다 
		 */
		
		// 입력 input 인스턴스 of Scanner
		/* System.in 어쩌고를 사용할 수도 있지만 자꾸 아스키 값이 나오기 때문에 입력값을 내가 원하는 형태로 변환해주는 변환기 scanner를 사용한다 */
		
		//초기화
//		ServiceDemo service = new ServiceDemo(10, "car park"); //생성자를 여러개 만들고 싶으면 기본 생성자를 반드시 입력해야한다. 
//		System.out.println(service.toString()); 
		ParkService service = new ParkService(); 
	
		Scanner input = new Scanner(System.in);
		
	
		/* 초기에는 아무거나 입력해도 시스템이 실행이 되기 때문에 예외처리를 해주어야한다 (1,2,3이 아니라 다른 문자를 입력해도 시스템이 움직인다던가..) */
		while(true) {
			System.out.println("[1]In [2]Out [3]Exit > ");							 //키보드에서 입력받기 
			String menu = input.nextLine(); //nextLine 행 하나를 입력받는다 (문자열을 입력받는다) //키보드에서 입력받기 
			if(menu.equals("3")) { //입력자체를 String으로 받아서 처리하겠다 (정수로 보이지만, 산수를 하진 않을 거니까) // 프로그램 종료 조건 (사용자 선택) //문자열 비교하기  
				System.out.println("종료");
				break;
			}
			if(menu.equals("2")) { // 차 확인 후 요금 정산 
				System.out.println("요금 정산 : 차 나감 ");
				// 검색 필요 ( 요금 정산을 받은 차가 무엇인지 알아야한다 ) 
				System.out.println("차량 번호 : "  ); 
				String carNo = input.nextLine(); //차량 번호 받기  //차가 나간 후에 차 자리를 비우려고 하려면 차의 위치를 또한 받아야한다 (배열의 요소번호처럼) 
				
				// 검색 - inTime (입력받은 차 번호를 ParkService로 가져간다)
				Car car = service.getCar(carNo); //차에 대한 정보를 가져와서 car에다 넣는다  (service라는 클래스 안에 getCar)
				if(car == null) {
					System.out.println("등록된 차량이 아님");
				}
				
//				int inTime = 0130; //24시간제 (새벽 1시에 들어온 차 ) //그냥 화면에 찍어보려고 임의로 해놓은 것 
//				int inTime = car.getIntime(); //Car안에 보면 들어올 때 저장했던 정보가 있다.. //???????
				System.out.println("나간 시간 : "); //car정보에 들어온 시간은 있겟지만, 나가는 시간은 없을 것 따라서 그대로 둠 
				int outTime = Integer.parseInt(input.nextLine());
				car.setOuttime(outTime); //나간 시간 저장 //getter setter 이름 뒤에는 필드 이름이므로 이런 필드가 있구나! 하고 알아야함 
				/*Car는 정보만 가지고 있고 계산은 service가 한다 */
				System.out.println("요금 : " );
				//시간 계산 
				
				double price = service.getPrice(car); //(inTime, outTime)이라고 해도 되지만 우리는 car를 전달해본다 .
//				int diff = outTime - inTime;
//				//요금 계산 (금액 계산은 double 타입)
//				double price = 5000; // 돈 계산은 여기서 하지 않고 service에게 시킨다 
//				price += (diff/10) * 500; //추가요금 (나누기 10 : 10분 단위로 500원 추가)
				System.out.println(price);
				
				//차가 들어와서 저장했던 기록 - 비우기 (차가 나감)
				System.out.println("차 나갔으니까 청소하기 ");
			}
			if(menu.equals("1")) { //정보 저장 
				Car car = new Car(); //차가 하나 새로 생긴다 
				System.out.println("시간 기록 : 차 들어옴");
				System.out.println("차량 번호 : "  ); 
				String carNo = input.nextLine(); //차량 번호 받기 //차량 번호는 문자열로 본다
				
				//todo : 차가 들어갔다는 표현이 없다 save/clean이 호출안됨 
				
				
				System.out.println("들어온 시간 : ");
				// 사용자가 HHmm 숫자 입력한다는 전제 
				int inTime = Integer.parseInt(input.nextLine()); //들어오는 시간 (Line으로 문자열을 받고 통째로 int로 parse시킴(바꿈)) //nextInt로 받아도 됨	
				car.setIntime(inTime); 
//				int outTime = 0; //나가는 시간 HHmm (네자리 정수로 받는다) // 지금 막 들어오는 중이니까 나가는 시간은 0으로 초기화 시켜놓음 
				String s = ""; //입력받은 정보들(문자열들)을 싹 다 붙여 긴 문자열을 만든다  
//				//car의 필드들을 출력하는 것과 같으므로 잘라내서 car클래스로 
//				s += carNo + " : ";
//				s += inTime + "-";
//				s += outTime;
				System.out.println(car); //이 작업을 해주는 lib가 또 있다 // toString()
			}
		}//실제 실행 내용 while loop 
		
//		// 출력
//		System.out.println();

		//닫기 (열었으면 항상 닫도록) : 정리 (닫기 전에 가지고 있는 데이터들을 백업을 시킬 것인지와 같은 작업단계를 거친다 )
		if(input != null) {
			input.close(); //점을 찍으려면 왼쪽의 이름이 null이 아니여야한다 
		}
		
	}//main end 

}
