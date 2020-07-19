package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;

	public Base()  {

		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\ObjectRepository\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void launchBrowser() {
		String browsername = prop.getProperty("Browser");
		if (browsername.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();

			
		}
		driver.manage().deleteAllCookies();
		wait=new WebDriverWait(driver, 20l);
		driver.get(prop.getProperty("URL"));

		
	}
	

}
