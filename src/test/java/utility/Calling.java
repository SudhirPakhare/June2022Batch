package utility;

public class Calling
{
	public static void main(String[] args)
	{   //browserLaunch
		Object[] input=new Object[2];
		input[0]="Chrome";
		input[1]= "G:\\Automation support\\chromedriver_win32\\chromedriver.exe";		
		SeleniumOperations.browserLaunch(input);
		
		//openApplication
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		SeleniumOperations.openApplication();
		
		//clickOnElement
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
		
		//mouseOverOnElement
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.mouseOverActions(input3);
		
		//clickOnMyProfile
		Object[] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		SeleniumOperations.clickOnElement(input4);
		
		//enterUsername
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]= "8308877313";
		SeleniumOperations.sendText(input5);
		
		//enterPassword
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]= "omsairam";
		SeleniumOperations.sendText(input6);
				
	    //clickOnLoginButton
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperations.clickOnElement(input7);
		
		//clickOnElement
				Object[] input9=new Object[1];
				input9[0]="//*[text()='Manage Addresses']";
				SeleniumOperations.clickOnElement(input9);
				
		
		
	}
}
