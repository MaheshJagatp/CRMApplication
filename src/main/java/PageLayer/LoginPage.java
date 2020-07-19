package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;
import ObjectRepository.Configuration;

public class LoginPage extends Base {
	
	public LoginPage()   {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath=Configuration.LoginBtn)
	WebElement LoginBtn;
	
	@FindBy(xpath=Configuration.loginUsernameInut)
	WebElement  loginUsernameInput;
	
	
	@FindBy(xpath=Configuration.loginPasswordInput)
	WebElement  loginPasswordInput;
	
	@FindBy(xpath=Configuration.loginLoginBtn)
	WebElement  loginLoginBtn;
	
	
	public void logbtnclk() {
		wait.until(ExpectedConditions.elementToBeClickable(LoginBtn)).click();
		
	}
	
	public void EnterValues(String User,String Password) {
		
		wait.until(ExpectedConditions.elementToBeClickable(loginUsernameInput)).sendKeys(User);
		wait.until(ExpectedConditions.elementToBeClickable(loginPasswordInput)).sendKeys(Password);
		
		//loginUsernameInput.sendKeys(User);
		//loginPasswordInput.sendKeys(Password);
		loginLoginBtn.click();
		
	
	}

}
