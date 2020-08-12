package utils;

import java.util.ArrayList;

import com.app.iacsd.Student;
import static utils.ValidationRules.*;

public class CollectionUtils {
	/*
	 * Add a static method "populateData" to return populated(sample data -- 4) AL *
	 * of students.
	 */
	public static ArrayList<Student> populateData() throws Exception {
		// create empty AL
		ArrayList<Student> l1 = new ArrayList<>();
		l1.add(new Student("dbda4", "abc3", 75,validateCourse("dbda"), parseDate("1-2-1996")));
		l1.add(new Student("dbda3", "abc5", 65, validateCourse("dmc"), parseDate("11-2-1996")));
		l1.add(new Student("dbda6", "abc1", 85, validateCourse("dmc"), parseDate("1-2-1996")));
		l1.add(new Student("dbda2", "abc2", 80, validateCourse("ditiss"), parseDate("1-2-1996")));
		return l1;
	}
}
