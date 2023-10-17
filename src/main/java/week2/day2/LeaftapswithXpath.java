package week2.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapswithXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 //add implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		
		 //locating username with xpath
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		 
		 //wait condition -->java wait -->explicit wait
		 Thread.sleep(3000); //not applying on the webelement  
		 //it is working on pausing execution
		 //slows down the execution
		 
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		
		
		 
	}

}
