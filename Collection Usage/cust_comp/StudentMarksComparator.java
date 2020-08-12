package cust_comp;

import java.util.Comparator;

import com.app.iacsd.Student;

public class StudentMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("in compare : marks");
		return ((Integer)o1.getMarks()).compareTo(o2.getMarks());
	}

}
