package TestNGdemo.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver Driver;
	
	public LoginPage(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(id = "login2")
	WebElement loginbutton;
	
	@FindBy (id = "loginusername")
	WebElement usernamefiled;
	
	
	@FindBy (id = "loginpassword")
	WebElement passwordfield;
	
	 @FindBy(xpath = "//div[@class='modal-footer']/button[@onclick='logIn()']")
	   WebElement logInButton;
	
	
	
	
	
	public void loginpage() {
		System.out.println("sfa");
		loginbutton.click();
		}
	
	public void username(String username) {
		
		usernamefiled.sendKeys(username);
	}
    public void password(String pass) {
    	passwordfield.click();
    	passwordfield.sendKeys(pass);
	}
	
	
	
	public void login() {
		logInButton.click();
	}
}
