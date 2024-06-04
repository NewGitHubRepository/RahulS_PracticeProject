package org.capgemini.seleniumDay1;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../CoreJavaBasics/src/Selenium Browsers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Dimension d = new Dimension(480,600);
		//driver.manage().window().setSize(d);  ///for setting the browser window
		
		driver.manage().window().maximize();     // for maximize the browser window
		driver.get("https://training.openspan.com/login");
		driver.findElement(By.id("user_name")).sendKeys("Ravi");
		driver.findElement(By.id("user_pass")).sendKeys("Ravi");
		driver.findElement(By.id("login_button")).click();
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		WebElement dropdown1 = driver.findElement(By.id("productType"));
		WebElement dropdown2 = driver.findElement(By.id("productsList"));
		Select s1 = new Select(dropdown1);
		s1.selectByVisibleText("Beverages");
		Select s2 = new Select(dropdown2);
		s2.selectByVisibleText("Ipoh Coffee");
		driver.findElement(By.className("login_button")).click();
		WebElement Qty = driver.findElement(By.id("product_quantity43"));
		Select s3 = new Select(Qty);
		s3.selectByVisibleText("2");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.cssSelector("input[name='edit_your_cart']")).click();
		driver.findElement(By.id("product_quantity1")).clear();
		driver.findElement(By.id("product_quantity1")).sendKeys("3");
		driver.findElement(By.id("upd_link")).click();
		driver.findElement(By.id("next1_button")).click();
		driver.findElement(By.id("bfirst_name")).sendKeys("Rahul");
		driver.findElement(By.id("blast_name")).sendKeys("Gupta");
		driver.findElement(By.id("bstreet_address")).sendKeys("Madhapur");
		driver.findElement(By.id("bzip_code")).sendKeys("400025");
		driver.findElement(By.id("barea_code")).sendKeys("350075");
		driver.findElement(By.id("bprimary_phone")).sendKeys("9990000910");
		driver.findElement(By.id("sfirst_name")).sendKeys("Rahul");
		driver.findElement(By.id("slast_name")).sendKeys("Gupta");
		driver.findElement(By.id("sstreet_address")).sendKeys("Madhapur");
		driver.findElement(By.id("szip_code")).sendKeys("400025");
		driver.findElement(By.cssSelector("input[class='input_long_size']")).sendKeys("rg123@gmail.com");
		driver.findElement(By.id("next2_button")).click();
		System.out.println(driver.findElement(By.id("credit_card")).isSelected());
		WebElement cardType = driver.findElement(By.id("card_type"));
		Select s4 = new Select(cardType);
		s4.selectByVisibleText("Visa");
		driver.findElement(By.id("card_number")).sendKeys("123456789012");
		driver.findElement(By.id("security_code")).sendKeys("999");
		WebElement expMon = driver.findElement(By.id("expiry_month"));
		Select s5 = new Select(expMon); 
		s5.selectByVisibleText("May");
		WebElement expYear = driver.findElement(By.id("expiry_year"));
		Select s6 = new Select(expYear); 
		s6.selectByVisibleText("2020");
		driver.findElement(By.id("submit_button")).click();
		System.out.println(driver.findElement(By.tagName("b")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='content']/div/p[2]")).getText());
		
		
		
		
	}

}
