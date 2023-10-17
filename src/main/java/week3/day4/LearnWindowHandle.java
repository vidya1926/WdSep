package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		System.out.println(driver.getTitle());

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);// address of the current window where the driver has control

		price.get(3).click();
		System.out.println(driver.getWindowHandle());

		Set<String> windowHandles = driver.getWindowHandles();

		for (String address : windowHandles) {
			System.out.println(address);
		}

		List<String> winHand = new ArrayList<String>(windowHandles);
		// switch to the child window
		driver.switchTo().window(winHand.get(1));
		System.out.println(driver.getTitle());

		// switch back to the parent
		driver.switchTo().window(winHand.get(0));
		System.out.println(driver.getTitle());

		price.get(4).click();
		// get the size of the windows/tab
		Set<String> windowHand = driver.getWindowHandles();
		System.out.println(windowHand.size());
		List<String> win = new ArrayList<String>(windowHand);
		driver.switchTo().window(win.get(2));
		System.out.println(driver.getTitle());
		// driver.close();//closes the window which the driver has control
		// interview q
		// How will you close the parent window except your child window?
		driver.switchTo().window(win.get(0));// switch to parent window
		// driver.close();
		// driver.switchTo().window(win.get(2));

		// how will you close all windows except the parent window?

		for (int i = 1; i <= win.size() - 1; i++) {
			driver.switchTo().window(win.get(i));
			driver.close();

		}

		// driver.quit(); //closes all the opened windows

	}

}
