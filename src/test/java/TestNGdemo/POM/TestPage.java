package TestNGdemo.POM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestPage {

	static WebDriver Driver;
	static LoginPage page;
	static SignUpPage page1;
	@BeforeTest
	public void setup() throws InterruptedException {
		Driver = new ChromeDriver();
		Driver.get("https://www.demoblaze.com/");
		CommonFunctions.maximizewindow(Driver);
	}
	
	@Test
	public void testlogin () throws InterruptedException {
		page=new LoginPage(Driver);
		page.loginpage();
		CommonFunctions.WaitForFixTime(3000);
		page.password("adgfg");
		page.username("Aswath");
		page.login();
		CommonFunctions.WaitForFixTime(3000);
		CommonFunctions.allertaction(Driver);
		
	}
	@Test	
	public void testsignup () throws InterruptedException {
		
		page1= new SignUpPage(Driver);
        Driver.navigate().to("https://www.demoblaze.com/");
		CommonFunctions.maximizewindow(Driver);
		page1.signinclick();
		CommonFunctions.WaitForFixTime(2000);
		page1.usernameEnter("Aswath1");
		page1.passwordEnter("asddf");
		int value1 = 10;
		int value2 = 20;
		Assert.assertEquals(value1, value2,"Values are not equal");
		CommonFunctions.WaitForFixTime(2000);
		page1.logininpress();
		CommonFunctions.WaitForFixTime(2000);
	
		CommonFunctions.WaitForFixTime(3000);
		CommonFunctions.allertaction(Driver);
		CommonFunctions.WaitForFixTime(3000);
		CommonFunctions.quit(Driver);
	
		
	}
}
