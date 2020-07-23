package StepDefination;

import Base.Base;
import PageLayer.CompaniesPage;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class StepDefCompanies extends Base{
  public CompaniesPage cp = new CompaniesPage();
	
    @After
    public void tearDown() {
    	driver.close();
    }
	@When("^User on Home Page$")
	public void user_on_Home_Page() throws Throwable {
	   
	}

	@When("^User Click on Companies Otions$")
	public void user_Click_on_Companies_Otions() throws Throwable {
	 cp.clickOnComapines();
	 Thread.sleep(2000);
	}

	@Then("^Comapines DashBord is Open$")
	public void comapines_DashBord_is_Open() throws Throwable {
	 cp.checkDashBordTitle();  
	}

	
	@When("^User on Comapines Dash Bord$")
	public void user_on_Comapines_Dash_Bord() throws Throwable {
	 cp.clickOnComapines();
	 cp.checkDashBordTitle();
	 }

	@Then("^New button is display$")
	public void new_button_is_display() throws Throwable {
	  cp.CheckNewButtonAreDisplay();
	}
	
	@Then("^Export button is display$")
	public void export_button_is_display() throws Throwable {
	cp.checkExportButtonDisplay();   
	}

	@Then("^Show filter button is display$")
	public void show_filter_button_is_display() throws Throwable {
	cp.checkShowFilterButtonDisplay();   
	}

	
	@When("^User Click on New Button then New Comapany Form will Open$")
	public void user_Click_on_New_Button() throws Throwable {
	  cp.clickOnNewButton();    
	}

	
	@When("^User Click on Export Button$")
	public void user_Click_on_Export_Button() throws Throwable {
	cp.clickOnExportButton();   
	}

	@Then("^Export Permission Box is Open$")
	public void export_Permission_Box_is_Open() throws Throwable {
	     cp.exportPermissionBoxOpenValidation();  
	
	
	
	}
	
	@When("^User Click on Show Filter Button$")
	public void user_Click_on_Show_Filter_Button() throws Throwable {
	  cp.clikOnShowFilterButton();
	}

	@Then("^Filter window will open$")
	public void filter_window_will_open() throws Throwable {
	  cp.FilterMenuValidation();
	 
	}
	
	
	@When("^User Click on Export Permission Box Ok Button$")
	public void user_Click_on_Export_Permission_Box_Ok_Button() throws Throwable {
	   cp.clickOnExportPermissionOkButton();
	}

	@Then("^User Go To Document Page$")
	public void user_Go_To_Companies_Page() throws Throwable {
	
	}

	@Then("^User Open Export File Folder$")
	public void user_Open_Export_File_Folder() throws Throwable {
	  
	}

	@Then("^Check with New File is created with name Comapnies export and current time$")
	public void check_with_New_File_is_created_with_name_Comapnies_export_and_current_time() throws Throwable {
	 
	}

	


}
