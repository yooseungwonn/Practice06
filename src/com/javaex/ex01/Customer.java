package com.javaex.ex01;

public class Customer extends Person{
	// 필드
	private int cNo;
	private int point;

	
	// 생성자
	public Customer(int cNo, int point) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 부모의 기본 생성자를 호출
		super();
		this.cNo = cNo;
		this.point = point;
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp); // 부모 생성자 호출
		this.cNo = cNo;
		this.point = point;
	}
	
	// getters/setters
	public int getCNo() {
		return cNo;
	}
	
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	@Override  // 현재 메서드가 Override인지 확인
	public void showInfo() {

		System.out.printf("이름= %s, 핸드폰= %s, 고객번호:=%d, 포인트=%d.%n", super.getName(), super.getHp(), cNo, point);
		
	}

	

	
}
