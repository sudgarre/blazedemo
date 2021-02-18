package org.sample;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pojo.Confirmation;
import com.pojo.IndexPages;
import com.pojo.Purchase;
import com.pojo.Reverse;
import com.resources.Base;

public class LogicSample extends Base{
	@Test
	@Parameters({"from","to"})
	public void meth(String s1,String s2) throws InterruptedException {
		lanuchBrowser("https://blazedemo.com/index.php");
		IndexPages i = new IndexPages();

		//Test1: Validate the page title
		String head= textFromWebElement(i.getHeading());
		Assert.assertTrue(head.equals("Welcome to the Simple Travel Agency!"));

		//Test2: Validate if the user is able to select departure and destination city
		dropDownSelect(i.getFrom(), s1);
		dropDownSelect(i.getTo(), s2);
		buttonClick(i.getFlight());

		Reverse r=new Reverse();
		buttonClick(r.getChoose().get(1));
		Thread.sleep(3000);
		Purchase p=new Purchase();

		//Test 3: Validate if the pricing format is in Double
		String total = textFromWebElement(p.getTotal());
		System.out.println("Total price of the flight is" + total);

		try {
			final double v = Double.parseDouble(total);
		} catch (NumberFormatException e) {
			System.out.println("Price format is not in decimal format");
		}

		//Test 4: Validate if the confirmation id is generated correctly
		buttonClick(p.getPurchase());
		Confirmation c=new Confirmation();
		System.out.println(textFromWebElement(c.getId()));

		//Proper logging would have been introduced using log4js if more time was available
	}
}
