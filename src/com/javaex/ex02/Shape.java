package com.javaex.ex02;

public class Shape {
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자 선언하지 않으면  기본 생성자를 자동으로 추가
	//임의로 생성자를 선언하면 기본 생성자를 자동으로 추가하지 않음
	
	public Shape(){
			
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		
	}
	
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


}
