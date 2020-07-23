package Utill;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Base;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Util extends Base {

	public static void drawBorder(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('style','border: solid 4px red');", element);

	
}
	
	public static void takeScreenShot(String name) throws IOException {
		Screenshot screenshot = new AShot().takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"png", new File(".\\ScreenShot\\"+name+".png"));
	}
}