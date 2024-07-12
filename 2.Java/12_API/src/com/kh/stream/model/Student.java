package com.kh.stream.model;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	private String genderr;
	private int meth;
	private int english;
	
	
	public Student() {
	}
	public Student(String name, int age, String genderr, int meth, int english) {
		this.name = name;
		this.age = age;
		this.genderr = genderr;
		this.meth = meth;
		this.english = english;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGenderr() {
		return genderr;
	}
	public void setGenderr(String genderr) {
		this.genderr = genderr;
	}
	public int getMeth() {
		return meth;
	}
	public void setMeth(int meth) {
		this.meth = meth;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", genderr=" + genderr + ", meth=" + meth + ", english="
				+ english + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, english, genderr, meth, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && english == other.english && Objects.equals(genderr, other.genderr)
				&& meth == other.meth && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
}
