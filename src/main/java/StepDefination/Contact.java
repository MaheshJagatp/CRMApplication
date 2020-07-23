package StepDefination;

import Base.Base;
import PageLayer.ContactPage;
import PageLayer.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Contact extends Base {
	LoginPage loginpage;
	ContactPage contactpage;
	boolean b=false;
	
	
	
	public Contact() {
		super();
	}
	
	@Before
	public void beforeHooks() {
		
	}
	
	@After
	public void afterHooks() {
		driver.quit();
	}
	
	
	
	@Given("^When User Enters URL$")
	public void when_User_Enters_URL() {
		Base.launchBrowser();
		loginpage=new LoginPage();
		loginpage.logbtnclk();
	    
	}
	
	@When("^User Enter UserName and Password$")
	public void User_Enter_UserName_and_Password()  {
	    
		loginpage.EnterValues(prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	@Then("^User Successfully Enters In Application$")
	public void User_Successfully_Enters_In_Application()  {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Cogmento CRM");
	   
	}
	
	
	
	
	
	@Given("^User Click On Contact Page$")
	public void user_Click_On_Contact_Page() {
	    
		contactpage=new ContactPage();
		contactpage.ContactClick();
		
	}

	@When("^User Checkes all Buttons are availiable On Contact Page$")
	public void user_Checkes_all_Buttons_are_availiable_On_Contact_Page() {
		 b=contactpage.ContactCheckBtn();
	    
	}

	@Then("^Contact Page Have All Buttons$")
	public void contact_Page_Have_All_Buttons() {
	    Assert.assertEquals(true, b);
		
	}

	
	
	
	
	@When("^User Click On New Button to Create Contacts$")
	public void user_Click_On_New_Button_to_Create_Contacts()  {
    
		contactpage.newBtnClick();
		
	}

	@And("^User Provides Details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Provides_Detail(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10)  {
	    contactpage.fillContactInformationForm(arg1);
		
		
		
		
	}

	@Then("^User Create Contact Successfully$")
	public void user_Create_Contact_Successfully()  {
	   
	}


	
	

}
