package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddress
{
	@When("^user click on manage Address$")
	public void user_click_on_manage_Address() throws Throwable 
	{   Thread.sleep(50000);
		Object[] input9=new Object[1];
	       input9[0]="//*[text()='Manage Addresses']";    
	       Hashtable<String,Object>  output9= SeleniumOperations.clickOnElement(input9);
	       HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^user click on MyProfile$" , output9.get("MESSAGE").toString());
   }
	
	@When("^user click on Add new Address$")
	public void user_click_on_Add_new_Address() throws Throwable
	{
		 Object[] input10=new Object[1];
	       input10[0]="//*[@class='_1QhEVk']";
	       Hashtable<String,Object>  output10=SeleniumOperations.clickOnElement(input10);
	       HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^user click on Add new Address$", output10.get("MESSAGE").toString()); 
	}
	
	

	@When("^user send \"([^\"]*)\" as name$")
	public void user_send_as_name(String text) throws Throwable
	{
		  Object[] input11=new Object[2];
	      input11[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
	      input11[1]= text;
	      Hashtable<String,Object>  output11=SeleniumOperations.sendText(input11);
	      HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"^user enter Name as \"([^\"]*)\"$", output11.get("MESSAGE").toString());
	}

	@When("^User send \"([^\"]*)\" as Mobile Number$")
	public void user_send_as_Mobile_Number(String text) throws Throwable
	{
		Object[] input12=new Object[2];
	      input12[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
	      input12[1]= text;
	      Hashtable<String,Object>  output12= SeleniumOperations.sendText(input12);
	      HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(),"^User enter Mobile Number as \"([^\"]*)\"$", output12.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as Pincode$")
	public void user_send_as_Pincode(String text) throws Throwable
	{
		Object[] input13=new Object[2];
	      input13[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
	      input13[1]= text;
	      Hashtable<String,Object>  output13=SeleniumOperations.sendText(input13);
	      HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(),"^user enter Pincode as \"([^\"]*)\"$", output13.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as Locality$")
	public void user_send_as_Locality(String text) throws Throwable
	{

	      Object[] input14=new Object[2];
	      input14[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
	      input14[1]= text;
	      Hashtable<String,Object>  output14=SeleniumOperations.sendText(input14);
	      HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(),"^user enter Locality as \"([^\"]*)\"$", output14.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as Address$")
	public void user_send_as_Address(String text) throws Throwable
	{

	      Object[] input15=new Object[2];
	      input15[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
	      input15[1]= text;
	      Hashtable<String,Object>  output15= SeleniumOperations.sendText(input15);
	      HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(),"^user enter Address as \"([^\"]*)\"$", output15.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as Landmark$")
	public void user_send_as_Landmark(String text) throws Throwable
	{
		 Object[] input16=new Object[2];
	      input16[0]="(//*[@class='_1w3ZZo _2mFmU7'])[6]";
	      input16[1]= text;
	      Hashtable<String,Object>  output16=SeleniumOperations.sendText(input16);
	      HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(),"^user enter Landmark as \"([^\"]*)\"$" , output16.get("MESSAGE").toString()); 
	}

	@When("^user send \"([^\"]*)\" as Ulternate mobile number$")
	public void user_send_as_Ulternate_mobile_number(String text) throws Throwable 
	{

	      Object[] input17=new Object[2];
	      input17[0]="(//*[@class='_1w3ZZo _2mFmU7'])[7]";
	      input17[1]= text;
	      Hashtable<String,Object>  output17=SeleniumOperations.sendText(input17);
	      HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(),"^user enter Ulternate mobile number as \"([^\"]*)\"$", output17.get("MESSAGE").toString());
	}

	@When("^user click on Home button$")
	public void user_click_on_Home_button() throws Throwable 
	{
		Object[] input18=new Object[1];
	       input18[0]="(//*[@class='_1XFPmK'])[1]";
	       Hashtable<String,Object>  output18=SeleniumOperations.clickOnElement(input18);
	       HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(),"^user click on Home button$", output18.get("MESSAGE").toString());
	}

	@When("^User click on Save button$")
	public void user_click_on_Save_button() throws Throwable
	{

	       Object[] input19=new Object[1];
	       input19[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
	       Hashtable<String,Object>  output19= SeleniumOperations.clickOnElement(input19);
	       HTMLReportGenerator.StepDetails(output19.get("STATUS").toString(),"^User click on Save button$", output19.get("MESSAGE").toString());
	}

	@Then("^Application shows user address save$")
	public void application_shows_user_address_save() throws Throwable
	{     Thread.sleep(5000);
		  Object[] input20=new Object[2];
	        input20[0]="(//*[@class='_1GczDM'])[2]";
	        input20[1]="HOME";
	       Hashtable<String,Object>  output20= SeleniumOperations.validation(input20);
	        HTMLReportGenerator.StepDetails(output20.get("STATUS").toString(),"^Application shows user address save$", output20.get("MESSAGE").toString());
	}



}
