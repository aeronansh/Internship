package day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Validation {
	
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat( "dd-MM-yyyy" );
	}
	
	public static Date parseDate( String dt ) throws Exception {
		return sdf.parse( dt );
	}

}
