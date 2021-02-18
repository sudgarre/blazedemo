package com.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Base;

public class Reverse extends Base{

	public Reverse() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Choose This Flight']")
	private List<WebElement> choose;

	public List<WebElement> getChoose() {
		return choose;
	}
	
	
}
