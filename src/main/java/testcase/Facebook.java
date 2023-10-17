package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	//public ChromeDriver driver;
	//public EdgeDriver driver1;
	
	public RemoteWebDriver driver;
	@Parameters({"url","email","password","browser"})
	@BeforeMethod
	public void preCondition(String url,String email,String password,String browser) {
		
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
		driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
	}
	
	@Test
	public void homePage() {
		System.out.println("Welcome to Facebook");
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	

}
