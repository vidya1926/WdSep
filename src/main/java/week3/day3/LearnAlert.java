package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		// switch the driver focus to alert box
		Alert alert = driver.switchTo().alert();
		// to get the text from the alert
		System.out.println(alert.getText());
		alert.accept();

		// driver.switchTo().alert().accept();

		// ConfirmationAlert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());

		// Handling Sweet Alert

		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		// alert.dismiss(); -->no such alert present

		// handle the element normally
		driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		WebElement close = driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following-sibling::a"));

		driver.executeScript("arguments[0].click();", close);
		
	}

}
