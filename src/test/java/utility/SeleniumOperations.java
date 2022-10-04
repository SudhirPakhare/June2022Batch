package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;



public class SeleniumOperations
{
     public static WebDriver driver =null;
     
     public static ConfigReader config;
     
     public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
     
     
	//browserLaunch
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{  
	  try	
	  {
		  String bName=(String) inputParameters[0];
	      
	   
	   if(bName.equalsIgnoreCase("Chrome"))
	   {  
		   config=new ConfigReader();
		  
		  System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	   }
	   
	   else if(bName.equalsIgnoreCase("Firefox"))
	   {
		  System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
	      driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	   }
	   
	       outputParameters.put("STATUS", "Pass");
	       outputParameters.put("MESSAGE", "Method used:browserLaunch  , Input Given:" +inputParameters[0].toString());
	 }
	   catch(Exception e)
	   {
		   outputParameters.put("STATUS", "Fail");
	       outputParameters.put("MESSAGE", "Method used:browserLaunch  , Input Given:" +inputParameters[0].toString());
	   }
	  return outputParameters;
	   
	}
	
	
	//openApplication
	public static Hashtable<String,Object> openApplication()
	{
	  try
	   { 
	    
	     driver.get(config.getApplicationUrl());
	     driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	     outputParameters.put("STATUS", "Pass");
	     outputParameters.put("MESSAGE", "Method used:openApplication  , Input Given:" +  config.getApplicationUrl().toString());
	   }
	  catch(Exception e)
	   {
		  outputParameters.put("STATUS", "Fail");
		     outputParameters.put("MESSAGE", "Method used:openApplication  , Input Given:" + config.getApplicationUrl().toString());
	   }
	  return outputParameters;
	}
	
	
	//click 
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
	  try	
	   { String locator=(String) inputParameters[0];
	     driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	     driver.findElement(By.xpath(locator)).click();
	     
	     outputParameters.put("STATUS", "Pass");
	     outputParameters.put("MESSAGE", "Method used:clickOnElement  , Input Given:" +inputParameters[0].toString());
	   }
	  catch(Exception e)
	   {
		  outputParameters.put("STATUS", "Fail");
		     outputParameters.put("MESSAGE", "Method used:clickOnElement  , Input Given:" +inputParameters[0].toString());
	   }
	  return outputParameters;
	}
	
	
	//mouseOver
	public static Hashtable<String,Object> mouseOverActions(Object[]inputParameters)
	{
	  try	
	   {  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		  String locator=(String) inputParameters[0];
	      Actions act=new Actions(driver);
	      WebElement abc=driver.findElement(By.xpath(locator));
	      act.moveToElement(abc).build().perform();
	      
	      outputParameters.put("STATUS", "Pass");
		  outputParameters.put("MESSAGE", "Method used:mouseOverActions  , Input Given:" +inputParameters[0].toString());
	   }
	  catch(Exception e)
	   {
		  outputParameters.put("STATUS", "Fail");
		  outputParameters.put("MESSAGE", "Method used:mouseOverActions  , Input Given:" +inputParameters[0].toString());
	   }
	  return outputParameters;
	}
	
	
	//sendKeys
	public static Hashtable<String,Object> sendText(Object[]inputParameters)
	{ 
	  try 	
	  { String locator=(String) inputParameters[0];
	    String sendText=(String) inputParameters[1];
	    driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	    driver.findElement(By.xpath(locator)).sendKeys(sendText);
	    
	    outputParameters.put("STATUS", "Pass");
	    outputParameters.put("MESSAGE", "Method used:sendText  , Input Given:" +inputParameters[0].toString());
	  }
	  catch(Exception e)
	   {
		  outputParameters.put("STATUS", "Fail");
		    outputParameters.put("MESSAGE", "Method used:sendText  , Input Given:" +inputParameters[0].toString());
	   }
	  return outputParameters;
	}
	
	//validation
	 public static Hashtable<String,Object> validation(Object[]inputParameters) throws InterruptedException
	   {  Thread.sleep(5000);
		 try
	       {  String xpath=(String) inputParameters[0];
		      String givenText=(String) inputParameters[1];
		      String findedText=driver.findElement(By.xpath(xpath)).getText();
		   if(findedText.equalsIgnoreCase(givenText))
		    {
			   System.out.println("Test Case Pass");
		    }
		   else
		    {
			   System.out.println("Test Case Fail");  
		    }
		    outputParameters.put("STATUS", "Pass");
		    outputParameters.put("MESSAGE", "Method used:validation  , Input Given:" +inputParameters[0].toString());
	       }
	     catch(Exception e)
	       {
	    	 outputParameters.put("STATUS", "Fail");
	 	    outputParameters.put("MESSAGE", "Method used:validation  , Input Given:" +inputParameters[0].toString());
	       }
	   return outputParameters;
	   }

}
