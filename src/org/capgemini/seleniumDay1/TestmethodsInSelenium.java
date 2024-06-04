package org.capgemini.seleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestmethodsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../CoreJavaBasics/src/Selenium Browsers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
