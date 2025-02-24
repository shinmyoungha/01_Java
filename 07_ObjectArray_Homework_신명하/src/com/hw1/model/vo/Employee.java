package com.hw1.model.vo;

public class Employee {
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}
	
	public Employee(int empNo, String empName, int age, 
				char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}


	public Employee(int empNo, String empName, String dept, 
			String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
	
		this.empNo = empNo; // 사번
		this.empName = empName; // 사원명
		this.dept = dept; // 소속부서
		this.job = job; // 직급
		this.age = age; // 나이
		this.gender = gender; // 성별
		this.salary = salary; // 급여
		this.bonusPoint = bonusPoint; // 보너스 포인트
		this.phone = phone; // 전화번호
		this.address = address; // 주소
	}

	
	// 사번
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	// 사원명
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	// 소속부서
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// 직급
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	// 나이
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 성별
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 급여
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 보너스 포인트
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	// 전화번호
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 주소
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String information() {
		return empNo + ", " + empName + ", " 
				+ dept  + ", " + job + ", " 
				+ age + ", " + gender + ", " 
				+ salary + ", " + bonusPoint + ", " 
				+ phone + ", " + address;
	}

}