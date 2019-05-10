package practiceamazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class = 'datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class = 'next']")).click();
			
		}
		
		List <WebElement> dates = driver.findElements(By.className("day"));
		int count = dates.size();
		for (int i=0;i<count; i++)
		{
			String text =  driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("27"))
			{
				driver.findElements(By.className("day")).get(i).click();
			}
		}
		
	}
}

		