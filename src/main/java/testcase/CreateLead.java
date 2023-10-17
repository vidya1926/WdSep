package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider="sendData")
	public void runCreatelead(String cName,String fname,String lname ) {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider
	public String[][] sendData() {
		// to have the configuration with rows and col

		String[][] data = new String[3][3];

		data[0][0] = "Testleaf";
		data[0][1] = "Hari";
		data[0][2] = "R";

		data[1][0] = "Testleaf";
		data[1][1] = "Vidya";
		data[1][2] = "R";

		data[2][0] = "Testleaf";
		data[2][1] = "Dilip";
		data[2][2] = "R";

		return data;

	}

}
