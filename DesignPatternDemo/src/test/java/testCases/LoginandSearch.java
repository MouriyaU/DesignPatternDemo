package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HotelAppLoginPage;
import pages.HotelAppSearchPage;


public class LoginandSearch {

	public static void main(String[] args) 
	{
		//Set the chrome driver path
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

		
		//Create object of the search page
		HotelAppSearchPage objSearch = new HotelAppSearchPage(driver);
		
		//Enter search parameters and login
		objSearch.enterSearchParameters("Sydney", "Hotel Sunshine", "Double", "2", "24/12/2022", "27/12/2022", "2", "1");
		objSearch.clickSearchBtn();
	}

}
