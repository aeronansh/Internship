package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.iacsd.Course;

public class ValidationRules {
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	//static method for parsing date
	public static Date parseDate(String dt) throws Exception {
		return sdf.parse(dt);
	}
	// static method for validating course
	public static Course validateCourse(String cName) throws Exception {
		return Course.valueOf(cName.toUpperCase());
	}
}
