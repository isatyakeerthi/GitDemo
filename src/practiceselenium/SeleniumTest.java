package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> dates = driver.findElements(By.className("day"));
		System.out.println(driver.findElements(By.className("days")).size());
		int count = driver.findElements(By.className("days")).size();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		//driver.get("http://spicejet.com");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click();// absolute xpath for google Images button.
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//s.selectByIndex(2);
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		

		
	}

}
