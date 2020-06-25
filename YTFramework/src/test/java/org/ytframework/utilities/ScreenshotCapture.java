package org.ytframework.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture 
{
	public static void screenshotcap(ChromeDriver driver, String path) throws IOException
	{
		File source=driver.getScreenshotAs(OutputType.FILE);
		File destination= new File(path);
		FileUtils.copyFile(source, destination);
	}

}
