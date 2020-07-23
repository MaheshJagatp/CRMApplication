package PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;
import ObjectRepository.Configuration;
import Utill.Util;

public class ContactPage extends Base {

	public ContactPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = Configuration.contactPageClick)
	WebElement contactPageClick;
	
	@FindBy(xpath=Configuration.contactNewBtn)
	WebElement contactnewbtn;
	
	@FindBy(xpath=Configuration.contactShowFilterBtn)
	WebElement contactshowfilterbtn;
	
	@FindBy(xpath=Configuration.contactExportBtn)
	WebElement contactexportbtn;
	
	@FindBy(xpath=Configuration.contactPinIcon)
	WebElement contactpinicon;

	
	@FindBy(xpath=Configuration.contactDeleteIcon)
	WebElement contactdeleteicon;
	
	@FindBy(xpath=Configuration.contactSettingIcon)
	WebElement contactsettingicon;
	
	@FindBy(xpath=Configuration.contactFirstNameInput)
	WebElement contactfirstnameinput;
	
	@FindBy(xpath=Configuration.contactLastNameInut)
	WebElement contactlastnameinput;
	
	@FindBy(xpath=Configuration.contactMiddleNameInput)
	WebElement contactmiddlenameinput;
	
	@FindBy(xpath=Configuration.contactCompanyInput)
	WebElement contactcompanyinput;
	
	@FindBy(xpath=Configuration.contactEmailAddressInput)
	WebElement contactemailaddressinput;
	
	@FindBy(xpath=Configuration.contactStatusInput)
	WebElement contactstatusinput;
	
	@FindBy(xpath=Configuration.contactDescriptionInput)
	WebElement contactdescriptioninput;
	
	@FindBy(xpath=Configuration.contactDayInput)
	WebElement contactdayinput;
	
	@FindBy(xpath=Configuration.contactMonthInput)
	WebElement contactmonthinput;
	
	@FindBy(xpath=Configuration.contactYearInput)
	WebElement contactyearinput;
	
	
	
	
	
	public void ContactClick() {
	wait.until(ExpectedConditions.elementToBeClickable(contactPageClick)).click();
		
		//contactPageClick.click();
		
	}
	
	
	public boolean ContactCheckBtn() {
	if(	wait.until(ExpectedConditions.elementToBeClickable(contactnewbtn)).isDisplayed()  &&
		wait.until(ExpectedConditions.elementToBeClickable(contactshowfilterbtn)).isDisplayed()  &&
		wait.until(ExpectedConditions.elementToBeClickable(contactexportbtn)).isDisplayed() &&
		wait.until(ExpectedConditions.elementToBeClickable(contactpinicon)).isDisplayed()  &&
		wait.until(ExpectedConditions.elementToBeClickable(contactdeleteicon)).isDisplayed()  &&
		wait.until(ExpectedConditions.elementToBeClickable(contactsettingicon)).isDisplayed()
		
		) {
		return true;
	}
		
		
	return false;
	}
	
	
	
	public void newBtnClick() {
		
		//wait.until(ExpectedConditions.elementToBeClickable(contactnewbtn)).click();
		contactnewbtn.click();
	}
	
	public void fillContactInformationForm(String firstname) {
		//contactfirstnameinput.sendKeys(Keys.F5);
		driver.navigate().refresh();
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		
		wait.until(ExpectedConditions.elementToBeClickable(contactfirstnameinput)).sendKeys(firstname);
		
	
	//	Util.selectclass(contactstatusinput,"New");
		
		
		
	}
	
	
	
	

}
