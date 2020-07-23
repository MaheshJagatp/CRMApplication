package PageLayer;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;
import ObjectRepository.Configuration;
import Utill.Util;
import cucumber.runtime.junit.Assertions;
import net.sf.cglib.asm.MethodAdapter;

public class CompaniesPage extends Base {

	public CompaniesPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH ,using =Configuration.comapniesExportButton)
	WebElement a;
	@FindBy(xpath = Configuration.ComapniesMenu)
	WebElement comapinesMenu;

	@FindBy(xpath = Configuration.comapniesDashBordTitle)
	WebElement comapinesDashBordTitle;

	@FindBy(xpath = Configuration.companiesNewButton)
	WebElement newButton;

	@FindBy(xpath = Configuration.compniesShowFiltersButton)
	WebElement showFilterButton;

	@FindBy(xpath = Configuration.comapniesExportButton)
	WebElement exportButton;

	@FindBy(xpath = Configuration.exportPermissionBox)
	WebElement exportPermisionBox;
	
	@FindBy(xpath = Configuration.FilterMenu)
	WebElement 	FilterMenu;
	
	@FindBy(xpath = Configuration.exportPermissionOkButton)
	WebElement exportPermissionOkButton;


	public void clickOnComapines() {
		wait.until(ExpectedConditions.elementToBeClickable(comapinesMenu)).click();
	}

	public void checkDashBordTitle() {
		String DashbordTile = wait.until(ExpectedConditions.visibilityOf(comapinesDashBordTitle)).getText();
		Assert.assertEquals(DashbordTile, "Companies");

	}

	public void CheckNewButtonAreDisplay() {
		// TODO Auto-generated method stub
		Assert.assertTrue("New Button is not display", newButton.isDisplayed());
	}

	public void checkExportButtonDisplay() {
		// TODO Auto-generated method stub
		Assert.assertTrue("Export Button is not display", exportButton.isDisplayed());

	}

	public void checkShowFilterButtonDisplay() {
		// TODO Auto-generated method stub
		Assert.assertTrue("Show Filter Button is not display", showFilterButton.isDisplayed());

	}

	public void clickOnNewButton() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(newButton)).click();
		Assert.assertEquals("URL are not match", "https://ui.freecrm.com/companies/new", driver.getCurrentUrl());
	}

	public void clickOnExportButton() {
         //exportButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(exportButton)).click();
		System.out.println("Click on export button");

	}

	public void exportPermissionBoxOpenValidation() {
		// TODO Auto-generated method stub
		Assert.assertTrue("Export persmission box is not open", wait.until(ExpectedConditions.elementToBeClickable(exportPermisionBox)).isDisplayed());
	}

	public void clikOnShowFilterButton() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.elementToBeClickable(showFilterButton)).click();
		
	}

	public void FilterMenuValidation() throws IOException {
	
		// TODO Auto-generated method stub
		Util.drawBorder(driver, wait.until(ExpectedConditions.elementToBeClickable(FilterMenu)));
		Util.takeScreenShot(Thread.currentThread().getStackTrace()[1].getMethodName());
		Assert.assertTrue("Export persmission box is not open", wait.until(ExpectedConditions.elementToBeClickable(FilterMenu)).isDisplayed());
         
	}

	public void clickOnExportPermissionOkButton() throws IOException {
		
		
	    wait.until(ExpectedConditions.elementToBeClickable(exportPermissionOkButton)).click();
	    Util.takeScreenShot(Thread.currentThread().getStackTrace()[1].getMethodName()); 
		
	}

}
