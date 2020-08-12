package com.app.iacsd;

import java.util.Date;
import static utils.ValidationRules.*;

public class Student implements Comparable<Student> {
	private String rollNo, name;
	private int marks;
	private Course chosenCourse;
	private Date dob;

	public Student(String rollNo, String name, int marks, Course chosenCourse, Date dob) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.chosenCourse = chosenCourse;
		this.dob = dob;
	}

	public Student(String rollNo) {
		super();
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in student's equals");
		if (o instanceof Student) {
			Student s = (Student) o;
			return rollNo.equals(s.rollNo);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", chosenCourse=" + chosenCourse
				+ ", dob=" + sdf.format(dob);
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		// sorting based on roll no
		System.out.println("in compare to");
		return rollNo.compareTo(o.rollNo);
		

	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public Course getChosenCourse() {
		return chosenCourse;
	}

	public Date getDob() {
		return dob;
	}
	

}
