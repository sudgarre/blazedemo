package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Base;

public class IndexPages extends Base {

	public IndexPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Welcome ')]")
	private WebElement heading;
	
	@FindBy(name="fromPort")
	private WebElement from;
	

	@FindBy(name="toPort")
	private WebElement to;
	
	@FindBy(xpath="//input[@value='Find Flights']")
	private WebElement flight;

	public WebElement getHeading() {
		return heading;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getFlight() {
		return flight;
	}
	
	
}
