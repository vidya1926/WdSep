package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		List<Integer> priceList = new ArrayList<Integer>();
		for (int i = 0; i < price.size(); i++) {
			String text = price.get(i).getText();
			// priceList.add(text);
			if (!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");// 10,649-->10649
				System.out.println(replaceAll);
				int number = Integer.parseInt(replaceAll);
				priceList.add(number);
			}
		}
		System.out.println(price);
		System.out.println(priceList);

		Collections.sort(priceList);
		System.out.println(priceList);
		System.out.println(priceList.get(0));

		Integer min = Collections.min(priceList);
		System.out.println(min);

		Integer max = Collections.max(priceList);
		System.out.println(max);

	}

}
