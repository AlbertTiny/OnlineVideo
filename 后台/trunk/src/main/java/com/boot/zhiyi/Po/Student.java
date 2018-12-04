package com.boot.zhiyi.Po;

public class Student {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student() {
		super();
	}
	public Student(String n,Integer a) {
		super();
		this.name=n;
		this.age=a;
	}
}
