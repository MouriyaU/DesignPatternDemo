package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class HotelAppLoginPage 
{
	WebDriver driver;
	
	//Create constructor
	public HotelAppLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locator for user name
	By userName = By.id("username");
	
	//Locator for password
	By userPassWord = By.id("password");
	
	//Locator for login button
	By login_button = By.id("login");
	
	
	
	//Method to enter user name
	public void enterUserName(String user_Name)
	{
		driver.findElement(userName).sendKeys(user_Name);
	}
	
	//Method to enter password
		public void enterPassword(String user_PassWord)
	{
		driver.findElement(userPassWord).sendKeys(user_PassWord);
	}
		
	//Method to click login button
		public void clickLoginBtn()
	{
		driver.findElement(login_button).click();
	}
	
}


