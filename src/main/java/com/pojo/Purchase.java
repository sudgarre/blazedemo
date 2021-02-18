package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Base;

public class Purchase extends Base{

	public Purchase() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//em")
	private WebElement total;

	@FindBy(xpath="//input[@value='Purchase Flight']")
	private WebElement purchase;
	
	public WebElement getTotal() {
		return total;
	}

	public WebElement getPurchase() {
		return purchase;
	}
	
	
	
}
