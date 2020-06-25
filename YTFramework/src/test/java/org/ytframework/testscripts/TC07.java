package org.ytframework.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.ytframework.base.Baseclass;
import org.ytframework.pages.Login;
import org.ytframework.pages.Logout;
import org.ytframework.pages.Video_Play;
import org.ytframework.utilities.DateCalendar;
import org.ytframework.utilities.LogCapture;
import org.ytframework.utilities.ScreenshotCapture;

public class TC07 extends Baseclass
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
	public void testcase7() throws InterruptedException, IOException
	{
		/* -----------------------------Added this code in org.ytframework.pages package---------------------------------------*/
		
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
		Thread.sleep(5000);  */
		
		Login login=new Login(driver, pr);
		login.signin("hellowworld@gmail.com", "hellow@007");
		LogCapture.logcap("TC07", "TC07 - Signin successfully");
		ScreenshotCapture.screenshotcap(driver, "D:\\Screenshots" +DateCalendar.Date1()+".png");
		
		/*List<WebElement> videoplay=driver.findElements(By.id(pr.getProperty("videoplay")));
		for(WebElement video_play : videoplay)
		{
			video_play.click();
			System.out.println("Play video title is : "+video_play.getText());
			break;
		}
		Thread.sleep(6000); */
		
		Video_Play videoPlay=new Video_Play(driver, pr);
		videoPlay.videoplay();
		
		Actions page_scroll=new Actions(driver);
		page_scroll.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		
		WebElement comment =driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.click();
		Thread.sleep(3000);
		page_scroll.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		page_scroll.sendKeys("Awsome video.! I like it very much :-)").perform();
		Thread.sleep(3000);
		WebElement comment_post=driver.findElement(By.xpath(pr.getProperty("comment_post")));
		comment_post.click();
		Thread.sleep(3000);
		LogCapture.logcap("TC07", "Video is played and added the comment in it");
		ScreenshotCapture.screenshotcap(driver, "D:\\Screenshots" +DateCalendar.Date1()+".png");
		
		/* -----------------------------Added this code in org.ytframework.pages package---------------------------------------*/
		
		/*WebElement logoutbutton=driver.findElement(By.id(pr.getProperty("logoutbutton")));
		logoutbutton.click();
		Thread.sleep(7000);
		
		Actions ac=new Actions(driver);
		for(int i=0;i<=6;i++)
		{
			ac.sendKeys(Keys.TAB).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
	}*/
		
		Logout logout=new Logout(driver, pr);
		logout.signout();
		LogCapture.logcap("TC07", "Signout successfully");
		ScreenshotCapture.screenshotcap(driver, "D:\\Screenshots" +DateCalendar.Date1()+".png");
	/*@AfterMethod
	public void browserclose() throws InterruptedException
	{
		driver.close();
		Thread.sleep(5000);
	}*/
	

}
}
