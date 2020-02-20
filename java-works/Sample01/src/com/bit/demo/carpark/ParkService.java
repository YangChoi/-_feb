package com.bit.demo.carpark;
//같은 패키지이기 때문에 import 필요없음 

import com.bit.demo.carpark.model.Car;

public class ParkService {
	//Space 안에 Car 들이 여러개 저장되어 있다 
	private Space cardao; //주차공간 //dao : Data Access Object  
	
	public Car getCar(String carNo) { //car번호 요청한 것을 dao에 보냄
		return cardao.selectByNo(carNo);
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

}
