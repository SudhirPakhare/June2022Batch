package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{
     public static void main(String[] args) throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver", "G:\\Automation support\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  //Open Application
		  driver.get("https://www.flipkart.com/");
		//Click on cancel icon
		   driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	    //move to on login
		  Actions demo=new Actions(driver);
		  WebElement king=driver.findElementByXPath("//*[@class='_1_3w1N']");
		  demo.moveToElement(king).build().perform();
	   //click on my profile
		  driver.findElementByXPath("//*[text()='My Profile']").click();
		  driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("8308877313");
	   //Enter password
		  driver.findElementByXPath("//*[@type='password']").sendKeys("omsairam");
	   //Click on login button
		  driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		  Thread.sleep(5000);
		  
		  
		  
		  
	   //Click on manage Address
		  driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
		  //Click on Add new Address
		  driver.findElementByXPath("//*[@class='_1QhEVk']").click();
	   //enter name
		  driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[1]").sendKeys("Sudhir Pakhare");
	   //enter mobile no
		  driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[2]").sendKeys("9834581591");
	   //enter pincode
		  driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[3]").sendKeys("431107");
	   //enter locality
		  driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[4]").sendKeys("urban");
	   //Enter Address
		  driver.findElementByXPath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']").sendKeys("At-Paithan Tal-Paithan Dist-ch.Sambhajinagar");
	   //Enter Landmark
		  driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[6]").sendKeys("Rajmata Jijau lab,Near of ZP school, navin Kavsan");
	   //Ulternate mo no
		  driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[7]").sendKeys("8308877313");
	   //Click on Home Radio Button
		  driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]").click();
	   //Click on Save Button
		  driver.findElementByXPath("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']").click();
	  
	}
}
