package week3.day4;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// locate the required table
		WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table"));

		// From table get the row size
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());

		List<WebElement> colCount = row.get(0).findElements(By.tagName("th"));

		System.out.println(colCount.size());
		System.out.println("****************************************");

		// to print the all column values
		for (WebElement colValues : colCount) {
			System.out.println(colValues.getText());
		}
		System.out.println("****************************************");

		System.out.println("****************************************");// Method 2 -to print one row value from all col
		for (int i = 1; i < colCount.size(); i++) {

			String rowValues = driver
					.findElement(
							By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[" + i + "]"))
					.getText();
			System.out.println(rowValues);
		}

		System.out.println("****************************************");

		// to print one individual data from the 2nd row 3rd col
		String text = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[3]"))
				.getText();

		System.out.println(text);
		System.out.println("****************************************");

		// to print data from one col and all rows-->static col value and dynamic rows
		// (iterate to row) -to print names
		List<WebElement> onecolValue = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
		for (WebElement OneColumnValue : onecolValue) {
			System.out.println(OneColumnValue.getText());
		}

		System.out.println("****************************************");// Method 2 -to print one col value from all rows
		for (int i = 1; i < row.size(); i++) {
			String rowValues = driver
					.findElement(
							By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(rowValues);
		}

		System.out.println("****************************************");
		// to print all the values from the table
		for (WebElement rowValues : row) {
			System.out.println(rowValues.getText());

		}

		System.out.println("****************************************");// Method 2 to print all values from table

		for (int i = 1; i < row.size(); i++) {
			{

				System.out.println("Row " + i);// Method 2 to print all values from table

				for (int j = 1; j < colCount.size(); j++) {// inner loop first comples it siteration and then increments
															// the outer loop
					String rowValues = driver.findElement(By.xpath(
							"//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText();
					System.out.println(rowValues);
				} // i=1 ,j=1 -->tr[1]/td[1]

				// i=1 ,j=2 -->tr[1]/td[2]

			}

		}
	}

}
