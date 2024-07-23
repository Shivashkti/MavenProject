package com.Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Crossbrowser {

	WebDriver driver;

	public void openbrowser(String browserName) {

		switch (browserName) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "EDGE":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;

		}
	}

	@Parameters({ "browserName" })
	@Test
	public void verifybrowser(String browserName) {
		openbrowser(browserName);
		driver.get("https://www.selenium.dev/downloads/");
	}
}
