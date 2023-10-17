package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnFrame {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.switchTo().frame(0);//frame index starts with zero
		//ele is inside the frame
		driver.findElement(By.id("Click")).click();
		
		//to get completely out of the frame to main content 
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);//outer frame of second Ele
		driver.switchTo().frame("frame2");//inner frame is identified with frame attribute
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		//using frame as webelement
		WebElement frameele = driver.findElement(By.xpath("(//div[@class='card']/iframe)[2]"));
		driver.switchTo().frame(frameele);
		System.out.println(driver.findElement(By.id("Click")).getText());

	//     driver.switchTo().parentFrame();
	//	it takes you out of the immediate parent frame
		
	}

}
