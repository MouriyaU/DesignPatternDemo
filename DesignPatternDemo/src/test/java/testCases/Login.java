package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HotelAppLoginPage;


public class Login {

	public static void main(String[] args)
	{

		//Set the chromedriver path
				System.setProperty
				("webdriver.chrome.driver", 
						"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		        
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//Open browser URL
				String url = "http://adactinhotelapp.com";
				driver.get(url);
				
				
				//Create object of the login page
				HotelAppLoginPage objLogin = new HotelAppLoginPage(driver);
				
				//Enter details and login
				objLogin.enterUserName("TPillai567");
				objLogin.enterPassword("P1L618");
				objLogin.clickLoginBtn();
				

				

	}

}
