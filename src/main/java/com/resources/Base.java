package com.resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;

	public static WebDriver lanuchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public static void insert(WebElement ele, String name) {
		ele.sendKeys(name);
	}

	public static void buttonClick(WebElement ele) {
		ele.click();
	}

	public static String textFromWebElement(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public static String getAttribute(WebElement ele) {
		// TODO Auto-generated method stub
		String at = ele.getAttribute("value");
		return at;
	}

	public static void dropDownSelect(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}

	public static void browserQuit() {
		driver.quit();
	}
}
