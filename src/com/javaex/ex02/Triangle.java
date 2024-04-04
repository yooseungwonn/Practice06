package com.javaex.ex02;

public class Triangle extends Shape{
	// 필드
	private int width;
	private int height;
	
	// 생성자	
	public Triangle(int width, int height) {
		
		this.width = width;
		this.height = height;
		
	}
	public void showInfo() {
		// 부모 초기화
		
		System.out.println("====삼각형====");
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("가로: " + width);		
		System.out.println("세로: " + height);
	}

	
	
}


