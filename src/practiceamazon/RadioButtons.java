package practiceamazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		List <WebElement> radios= driver.findElements(By.name("optradio"));
		int count = radios.size();
		for(int i =0 ; i<count; i++)
		{
			String text = driver.findElements(By.name("optradio")).get(i).getAttribute("value");
			if(text.equals("Male")) 
			{
				driver.findElements(By.name("optradio")).get(i).click();
			}
		}
		
	}

}
