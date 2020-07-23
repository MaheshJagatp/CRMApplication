package Utill;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Util {
	
	
	public static void selectclass(WebElement element,String value) {
		Select select=new Select(element);
		
		select.selectByValue(value);
		
		
	}
	
	

}
