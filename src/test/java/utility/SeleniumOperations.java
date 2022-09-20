package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
     public static WebDriver driver =null;
     
	//browserLaunch
	public static void browserLaunch(Object[]inputParameters)
	{  
	  try	
	  { String bName=(String) inputParameters[0];
	   String webDriverExePath=(String) inputParameters[1];
	   
	   if(bName.equalsIgnoreCase("Chrome"))
	   {
		  System.setProperty("webdriver.chrome.driver", webDriverExePath);
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }
	   
	   else if(bName.equalsIgnoreCase("Firefox"))
	   {
		  System.setProperty("webdriver.gecko.driver", webDriverExePath);
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }
	 }
	   catch(Exception e)
	   {
		  System.out.println(e);
	   }
	   
	}
	
	
	//openApplication
	public static void openApplication(Object[]inputParameters)
	{
	  try
	   { String strUrl= (String) inputParameters[0];
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     driver.get(strUrl);
	   }
	  catch(Exception e)
	   {
		  System.out.println(e);
	   }
	}
	
	
	//click 
	public static void clickOnElement(Object[]inputParameters)
	{
	  try	
	   { String locator=(String) inputParameters[0];
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     driver.findElement(By.xpath(locator)).click();
	   }
	  catch(Exception e)
	   {
		  System.out.println(e);
	   }
	   
	}
	
	
	//mouseOver
	public static void mouseOverActions(Object[]inputParameters)
	{
	  try	
	   {  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  String locator=(String) inputParameters[0];
	      Actions act=new Actions(driver);
	      WebElement abc=driver.findElement(By.xpath(locator));
	      act.moveToElement(abc).build().perform();
	   }
	  catch(Exception e)
	   {
		  System.out.println(e);
	   }
	}
	
	
	//sendKeys
	public static void sendText (Object[]inputParameters)
	{ 
	  try 	
	  { String locator=(String) inputParameters[0];
	    String sendText=(String) inputParameters[1];
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(locator)).sendKeys(sendText);
	  }
	  catch(Exception e)
	   {
		  System.out.println(e);
	   }
	}
	
	//validation
	public static void validation(Object[]inputParameters)
	{  
	 try
	  { String xpath=(String) inputParameters[0];
	    String givenText=(String) inputParameters[1];
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    String findedText=driver.findElement(By.xpath(xpath)).getText();
	    if(findedText.equalsIgnoreCase(givenText))
	    {
	    	System.out.println("Test Case Pass");
	    }
	    else
	    {
	    	System.out.println("Test Case Fail");
	    }
	  }
	 catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}

}
