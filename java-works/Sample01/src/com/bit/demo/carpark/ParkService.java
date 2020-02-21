package com.bit.demo.carpark;
//같은 패키지이기 때문에 import 필요없음 

import com.bit.demo.carpark.model.Car;

public class ParkService {
	//Space 안에 Car 들이 여러개 저장되어 있다 
	private Space cardao; //주차공간 //dao : Data Access Object  
	//Space와 같은 클래스 타입들은 사용하려면 new 키워드로 생성해주어야한다 >>아니면 null상태로 있다보니 에러남 
	private int nums; //현재 주차 대수 
	
	//생성자 : 필요한 필드들의 초기화 (생성자 하기 싫으면 필드 옆에다가 대입연산해서 표현하면 되긴하는데 그냥 생성자로 표현해!)
	public ParkService() {
		cardao = new Space(20); // 최대 주차 대수
		/*
		 * 배열 처리시 길이 
		 *  최대 길이 : 요소 번호에 영향 줌 -고정길이
		 *  현재 길이 : 직접 처리해야 함 -커졌다 작아졌다 (따로 변수 하나 만들어서 관리를 하라는 뜻)
		 * 지금 우리는 듬성듬성 들어갔다 나갔다 하기 때문에 현재길이는 별 의미가 없고 고정값을 준다 
		 *  
		 */
	}
	public Car getCar(String carno) { //car번호 요청한 것을 dao에 보냄
		return cardao.selectByNo(carno);
	}

	public double getPrice(Car car) {
		//11:00 ~ 10: 00 > 한바퀴가 돌은 것 (다음날) : 이 계산은 다음에...
		int inMint = car.getIntime()%100; //분 자른 것 
		inMint += car.getIntime()/100*60; //시 자른 것, 들어온 시간 /100 > 네자리 중에 높은 두자리를 얻음 * 60 > 분단위로 바꿈
		
		int outMint = car.getOuttime()%100; //분 자른 것 
		outMint += car.getOuttime()/100*60; //시 자른 것, 들어온 시간 /100 > 네자리 중에 높은 두자리를 얻음 * 60 > 분단위로 바꿈
		
		int diff = (outMint - inMint) / 10; //나가는 시간이 더 크다는 전제하에, 분단위로 나눠서 10분으로 계산(10분에 추가요금)
		return 5000 + (diff*500);
	}
	/*insert 와 add, append는 다르다 (삽입과 추가)*/
	//todo : clean에 대한 행동, 처리를 만든다
	//어떤 행동, 처리를 만든다 >> 메서드를 만든다 
	
	//차가 들어옴 (새로 생성한다, 그것을 받아서 저장하기, 차가 들어온다 )  
	public boolean comeIn(Car car) {
		//저장하기 - Space.Car[] (Space에 있는 Car배열에다가)
		//저장했어요 안했어요 만 알면된다 (boolean) >if추가 
		//++(차가 들어옴)
		return cardao.save(car); //반환처리 
//		if(!cardao.save(car)) { //comeIn과 save가 잘 동작하는지 아려면 결과를 알아야함 : 반환처리 (일의 결과 확인) 
//			System.out.println("만차"); 내가 보고 있는 화면은 main이다 입출력은 main에서 이루어지기 때문에 본작업은 여기서 이루어질 일이 아님 (main도 전달이 됐는지 안됐는지 알아야함) 
//		}
		
	}
	public boolean outCome(Car car) {
		//car타입 받아서 요소 번호 받아서 지우면 된다. 
		int idx = cardao.indexOfNo(car.getNo()); //차량번호를 받는다  
		cardao.clean(idx); //지우는 작업 //위치 받음(인덱스) 
//		cardao.clean(car.getNo()); //전달 매개변수는 다르지만 하는 일은 같음(여러개의 함수를 만들수 있는 것 : 오버로딩)  
		//--(차 나감) > 함수안에다 변수 만듦 : 0인 상태 >> 여기서 ++ , -- 해봐야 계속 00이다. 
		//우리가 원하는 것은 누적이기 때문에 따라서 지역변수가 아닌 필드로 빼야한다 
		return true; //뭘 리턴해야할지 모르겠으면 대충 true로 해놓자
	}

}
