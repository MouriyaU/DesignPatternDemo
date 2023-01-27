package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelAppSearchPage 
{

	WebDriver driver;
	
	//Create constructor
	public HotelAppSearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	        //Locator for location
		    By location_dpDown = By.className("search_combobox");
		    
		    //Locator for hotel names
		    By hotel_dDown = By.cssSelector("#hotels.search_combobox");
		    
		    //Locator for ROOMTYPE
		    By roomtype_dDown = By.cssSelector("select[name=room_type]");
		    
		    //Locator for Drop down to select Number of Rooms
            By roomNo_dDown = By.id("room_nos");
            
            //Locator for check in date
            By date_in = By.id("datepick_in");
            
            //Locator for check out date
            By date_out = By.id("datepick_out");

            //Locator for adults
            By adult_no = By.id("adult_room");
            
            //Locator child 
            By child_no = By.id("child_room");
            
            //Locator for Search button
			By submit_button = By.id("Submit");
			
            //Locator for Reset button
			By reset_button = By.id("Reset");
		
			
			//Method to select/enter info on the Search page
			public void enterSearchParameters(String location,String hotel,String roomtype, String roomNo,String dateCheckIn,
					String dateCheckOut,String adultNo, String childNo)

			{
				//Drop down  to select LOCATION
				new Select(driver.findElement(location_dpDown)).selectByValue(location);
				
				//Drop down  to select hotel name
				new Select(driver.findElement(hotel_dDown)).selectByValue(hotel);
				
				//Drop down  to select room type
				new Select(driver.findElement(roomtype_dDown)).selectByValue(roomtype);
				
				//Drop down  to select room number
				new Select(driver.findElement(roomNo_dDown)).selectByValue(roomNo);
				
				//DEnter check in date
				driver.findElement(date_in).clear();
				driver.findElement(date_in).sendKeys(dateCheckIn);

				//Enter check out date
				driver.findElement(date_out).clear();
				driver.findElement(date_out).sendKeys(dateCheckOut);
				
				//Drop down  to select adults
				new Select(driver.findElement(adult_no)).selectByValue(adultNo);
				
				//Drop down  to select children
				new Select(driver.findElement(child_no)).selectByValue(childNo);
			}
			
			//Method to click the 'Search' button
			public void clickSearchBtn()
			{
				driver.findElement(submit_button).click();

			}
			
	}
			
	

