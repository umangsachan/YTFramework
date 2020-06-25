package org.ytframework.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalendar 
{
	public static String Date1()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss");  
	    Date date = new Date();
	    String dd=formatter.format(date);
	    dd.toString();
		return dd;
	    
	}
}
