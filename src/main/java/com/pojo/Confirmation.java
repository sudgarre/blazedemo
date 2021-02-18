package com.pojo;



import com.resources.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation extends Base {

	public Confirmation() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr[1]//td[2]")
	private WebElement id;

	public WebElement getId() {
		return id;
	}
	
	
}
