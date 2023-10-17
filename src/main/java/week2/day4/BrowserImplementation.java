package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;

public class BrowserImplementation extends LearnStatic {

	public void launchBrowser(String browserType) {
		System.out.println("Launching the chrome browser");
	}

	public int launchBrowser(int timeOut) {
		System.out.println("Launching the chrome browser");
		return timeOut;
	}

	public void launchBrowser(String browserType, String loadUrl) {
		if (browserType.equals("chrome")) {
			ChromeDriver driver = new ChromeDriver();
			driver.get(loadUrl);
		} else if (browserType.equals("edge")) {
			EdgeDriver driver1 = new EdgeDriver();
			driver1.get(loadUrl);
			ChromeOptions op = new ChromeOptions();
			Result driverPath = SeleniumManager.getInstance().getDriverPath(op, false);
			System.out.println(driverPath);

		}

	}

	public static void main(String[] args) {
		BrowserImplementation ob = new BrowserImplementation();
		ob.launchBrowser("chrome", "https://www.justickets.in");
		ob.launchBrowser("edge", "http://www.google.com");
		ob.launchBrowser(2000);
		System.out.println(calculation);

	}

}
