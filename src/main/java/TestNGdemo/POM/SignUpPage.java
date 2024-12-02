package TestNGdemo.POM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUpPage {

	static WebDriver Driver;
	
	public SignUpPage(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy (id ="signin2")
	WebElement signinbutton;
	
	
	@FindBy (id ="sign-username")
	WebElement username;
	
	@FindBy (id ="sign-password")
	WebElement password;
	
	@FindBy (xpath ="//button[@onclick='register()']")
	WebElement loginin;
	
	public void signinclick() {
		signinbutton.click();
	}
	
	public void usernameEnter(String user) {
		username.sendKeys(user);
	}
	
	public void passwordEnter(String pass) {
		
		password.sendKeys(pass);
	}
	
public void logininpress() {
		
	loginin.click();
	}
	
	
	
}
