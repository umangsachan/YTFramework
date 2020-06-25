package org.ytframework.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture 
{
	public static void logcap(String classname, String Message)
	{
		DOMConfigurator.configure("../YTFramework/LogCapture.xml");
		Logger lg=Logger.getLogger(classname);
		lg.info(Message);
	}

}
