package org.ytframework.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_Play 
{
	ChromeDriver driver;
	Properties pr;
	
	public Video_Play(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void videoplay() throws InterruptedException
	{
		List<WebElement> videoplay=driver.findElements(By.id(pr.getProperty("videoplay")));
		for(WebElement video_play : videoplay)
		{
			video_play.click();
			System.out.println("Play video title is : "+video_play.getText());
			break;
		}
		Thread.sleep(6000);
	}

}
