package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 //add implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 WebElement firstLink = driver.findElement(By.tagName("a"));
		 System.out.println(firstLink.getText());
	
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 System.out.println(allLinks.size());
		 
		allLinks.get(1).click();
	
		 
	}

}
