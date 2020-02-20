package com.bit.demo.carpark;

import com.bit.demo.carpark.model.Car;

public class Space {
	
	private Car[] carList;
	
	// 배열에 대한 처리 CRUD
	// 배열 안에 저장되는 각각의 데이터들 - 요소 
	// 요소는 정수 번호로 구분. [0] ~ [배열명.length-1]
	// 요소명 = 배열명 [번호]
	
	public Space(int size) {
		//생성자를 만들면 Space()(기본생성자)는 VM에 의해서 만들어지지 않는다
		carList = new Car[size]; //배열 길이있어야함(고정)
	}
	
	//차를 하나 꺼내줘(No 전달) 
	public Car selectByNo(String no) {
		//배열 안의 요소 하나를 꺼내온다
		int i = indexOfNo(no);
		if(i == -1) { //-1 : 없다 
			return null;
		}
		return carList[i];
	}
	
	//인텍스를 꺼내줘 (No 전달)
	//배열이니까 요소번호 찾는 것을 먼저 만들자 
	public int indexOfNo(String no) {
		for(int i = 0; i<carList.length; ++i) {
				if(carList[i].getNo().equals(no)) { //i번 car를 가져와서 그 안에 차 번호를 가져온다.그리고 차번호 비교(채이닝)
					//배열형,배열 안의 하나하나가 car형, car형 안에 string 타입, string타입 안의 메서드 (equals)
					return i;
				}
			}
		return -1; 
	}
	
	//비어있는지 찾자 
	//요소 번호가 필요하기 때문에 for문을 쓰는 것, 값 만이 필요하다면 for each(요소번호가 없고, 요소들의 값을 처리하는 방식) 
	private int isEmpty() { //요소 번호를 반환하는것! 값이 아니고 요소 번호!!!
		for(int i = 0; i<carList.length; ++i) {
		//i = 요소번호
			if(carList[i] == null) {
				return i; //찾으면 더 할 필요 없으니까 요소 번호를 return 값을 주고 밖으로 꺼냄
			}
		}
		
//		//for each(요소의 타입 : 배열명-덩어리의 이름)
//		for(Car c: carList) {
//			
//		}
		return -1; //실행이 여기까지 온다는 것 : 만차 (데이터를 계속 추가해 가는 과정이기 때문에 넘치면 안되는 배열 특성상 에러 표시를 해놔야함)
		//배열 요소 번호는 음수가 없기 때문에 음수로 표시해놓음 
	}
	public void save(Car car) { //차 추가
		//주차장에 차가 들어왔다 
		//요소가 주차 자리의 번호가 된다. 

		int idx = isEmpty();//비어 있는 자리를 찾아야한다. 그에 따른 메서드를 만든다 
		if(idx >= 0) { 
			carList[idx] = car; 
		}
	}
	
	//비우는 처리 
	public void clean(int idx) { //차 나감
		//주차장에 차가 나갔다
		carList[idx] = null; //차가 없다 : null 
		
	}
}
