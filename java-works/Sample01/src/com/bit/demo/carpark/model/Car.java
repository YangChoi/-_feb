package com.bit.demo.carpark.model;

public class Car {
	private String no;
	private int outtime; //대문자를 소문자로 바꾸고 setter뒤의 이름이랑 똑같이 해줘야함 
	private int intime;
	
	//getter setter는 항상 필드도 함께 만들어줘야함 
	public int getOuttime() {
		return this.outtime;
		
	}

	public void setOuttime(int outTime) {
		this.outtime = outTime;
		
	}
	
	public String getNo() {
		return this.no;
	}

	public void setNo(String carno) {
		this.no = carno;
		
	}
	//애노테이션(옵션)
	@Override
	public String toString(){ //toString() : 문자열로 바꾼다 (출력할 때 편하려고 함)
		String s = ""; 
		s += no + " : ";
		s += intime + "-";
		s += outtime;
		return s;
	}

	public void setIntime(int inTime2) {
		this.intime = inTime2;
		
	}
	public int getIntime() {
		return this.intime;
		
	}
	

}
