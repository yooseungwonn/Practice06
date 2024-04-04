package com.javaex.ex04;

public class Employee extends User { // 부모 설정
	// 필드
	private int salary;
	
	// 생성자
	// 기본 생성자
	public Employee() {
		
	}
	
	// id, password, name, salary
	public Employee(String id,String password, String name, int salary) {
		// 부모 먼저 초기화
		super(id, password, name);
		this.salary = salary;
	}
	// getters/setters
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int Salary) {
			this.salary = salary;
		}
		
		@Override
		public void showInfo() {
			System.out.println(" #id: " + id + " #password: " + password + " #이름:" + name + " #급여: " + salary);
		}


	
	

	
}
