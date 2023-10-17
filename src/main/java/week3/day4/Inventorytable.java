package week3.day4;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inventorytable {

	public static void main(String[] args) {
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("https://www.leafground.com/dashboard.xhtml");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * // locate the required table WebElement table =
		 * driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table"
		 * ));
		 * 
		 * // From table get the row size List<WebElement> row =
		 * table.findElements(By.tagName("tr")); System.out.println(row.size());
		 * 
		 * List<WebElement> col = row.get(1).findElements(By.tagName("td"));
		 * System.out.println(col.size());
		 * 
		 * 
		 * List<WebElement> onecolValue = driver .findElements(By.xpath(
		 * "//div[@class='ui-datatable-tablewrapper']/table/tbody/tr/td[1]")); for
		 * (WebElement OneColumnValue : onecolValue) {
		 * System.out.println(OneColumnValue.getText()); }
		 */
		
		String s="Java";
		String s1=new String("Java");
		String s2=s.intern();
		if(s2==s) {
			System.out.println("same");
		}else {
			System.out.println(":::");
		
		}
		if(s1==s) {
			System.out.println("same");
		}else {
			System.out.println(":::");
		
		}


	}

}
