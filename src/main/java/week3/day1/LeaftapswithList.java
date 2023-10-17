package week3.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapswithList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		
		 List<WebElement> credentials = driver.findElements(By.xpath("//input[@class='inputLogin']"));
		 credentials.get(0).sendKeys("DemoSalesManager");
		 credentials.get(1).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 
		 WebElement dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId")); 
		 Select select = new Select(dataSourceId);
		 List<WebElement> options = select.getOptions();
		 System.out.println(options.size());
		 options.get(12).click();
		 
		
		
		 
	}

}
