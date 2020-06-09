package org.ytframework.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04 
{
	ChromeDriver driver;
	@BeforeMethod
	public void browserlaunch() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Options option=driver.manage();
		Window win=option.window();
		win.maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);	
	}
	
	@Test
	public void testcase4() throws InterruptedException
	{
		WebElement signin=driver.findElement(By.cssSelector("paper-button[aria-label='Sign in']"));
		signin.click();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("nishantgoel0123");
		
		WebElement nextbutton1=driver.findElement(By.xpath("//*[@id='identifierNext']/span/span"));
		nextbutton1.click();
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("Nishant@123");
		
		WebElement nextbutton2=driver.findElement(By.xpath("//*[@id='passwordNext']/span/span"));
		nextbutton2.click();
		Thread.sleep(5000);
		
		WebElement library=driver.findElement(By.xpath("//a[@title='Library']"));
		library.click();
		Thread.sleep(5000);
		
		WebElement logoutbutton=driver.findElement(By.id("avatar-btn"));
		logoutbutton.click();
		Thread.sleep(7000);
		Actions ac=new Actions(driver);
		for(int i=0;i<=6;i++)
		{
			ac.sendKeys(Keys.TAB).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
	}
	@AfterMethod
	public void browserclose() throws InterruptedException
	{
		driver.close();
		Thread.sleep(5000);
	}
	

}
