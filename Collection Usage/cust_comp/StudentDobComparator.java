package cust_comp;

import java.util.Comparator;

import com.app.iacsd.Student;

public class StudentDobComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("in compare : dob");
		return o1.getDob().compareTo(o2.getDob());
	}

}
