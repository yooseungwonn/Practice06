package com.javaex.ex01;

public class Person {
	// 필드
	private String name;
	private String hp;
	
	// 생성자
	public Person() {
		this.name = "Unkwown";
		this.hp  = "Unknown";
	}
	
	public Person(String name, String hp) {
		super();
		this.name= name;
		this.hp= hp;
	}
	
	// getters/setters

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 핸드폰: %s%n",
				name, hp);
	}
	
	
	
}
