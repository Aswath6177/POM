package TestNGdemo.POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommonFunctions {
	
	
		
	
	public static void maximizewindow(WebDriver Driver) {
		Driver.manage().window().maximize();
	}
	
	public static void WaitForFixTime(int ms) throws InterruptedException {
		Thread.sleep(ms);
	}
	
	public static void navateback(WebDriver Driver) {
		Driver.navigate().back();
	}
	
	public static void quit(WebDriver Driver) {
		Driver.quit();
	}
	
	public static void allertaction(WebDriver Driver) {
		 Alert alert= Driver.switchTo().alert();
		 alert.accept();
		
	}
	
	
}
