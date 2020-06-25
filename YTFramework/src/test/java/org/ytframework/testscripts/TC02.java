package org.ytframework.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.ytframework.base.Baseclass;
import org.ytframework.pages.Login;
import org.ytframework.pages.Logout;
import org.ytframework.utilities.DateCalendar;
import org.ytframework.utilities.LogCapture;
import org.ytframework.utilities.ScreenshotCapture;

public class TC02 extends Baseclass
{
	//ChromeDriver driver;
	/*@BeforeMethod
	public void browserlaunch() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Options option=driver.manage();
		Window win=option.window();
		win.maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);	
	}*/
	
	@Test
	public void testcase2() throws InterruptedException, IOException
	{
		/*WebElement signin=driver.findElement(By.cssSelector(pr.getProperty("signin")));
		signin.click();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		WebElement email=driver.findElement(By.cssSelector(pr.getProperty("email")));
		email.sendKeys("nishantgoel0123");
		Thread.sleep(3000);
		
		WebElement nextbutton1=driver.findElement(By.xpath(pr.getProperty("nextbutton1")));
		nextbutton1.click();
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.cssSelector(pr.getProperty("password")));
		password.sendKeys("Nishant@123");
		
		WebElement nextbutton2=driver.findElement(By.xpath(pr.getProperty("nextbutton2")));
		nextbutton2.click();
		Thread.sleep(5000); */
		
		Login login=new Login(driver, pr);
		login.signin("hellowworld@gmail.com", "hellow@007");
		LogCapture.logcap("TC02", "TC02 - Signin successfully");
		ScreenshotCapture.screenshotcap(driver, "D:\\Screenshots" +DateCalendar.Date1()+".png");
		
		WebElement subscription=driver.findElement(By.xpath(pr.getProperty("subscription")));
		LogCapture.logcap("TC02", "Subscription clicked successfully");
		subscription.click();
		Thread.sleep(5000);
		
		/*WebElement logoutbutton=driver.findElement(By.id(pr.getProperty("logoutbutton")));
		logoutbutton.click();
		Thread.sleep(7000);
		Actions ac=new Actions(driver);
		for(int i=0;i<=6;i++)
		{
			ac.sendKeys(Keys.TAB).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();  */
		
		Logout logout=new Logout(driver, pr);
		logout.signout();
		ScreenshotCapture.screenshotcap(driver, "D:\\Screenshots" +DateCalendar.Date1()+".png");
	}
	/*@AfterMethod
	public void browserclose() throws InterruptedException
	{
		driver.close();
		Thread.sleep(5000);
	}*/
	

}
