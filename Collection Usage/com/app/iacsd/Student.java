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

	// add overloaded constr to encap. PK
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
		/*
		 * if(marks < o.marks) return -1; if(marks==o.marks) return 0; return 1; int
		 * ret=dob.compareTo(o.dob); if(ret == 0) { if(marks < o.marks) return -1;
		 * if(marks==o.marks) return 0; return 1; ret=
		 * ((Integer)marks).compareTo(o.marks); } return ret;
		 */

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
