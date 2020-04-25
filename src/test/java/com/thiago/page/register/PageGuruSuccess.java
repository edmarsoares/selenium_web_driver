package com.thiago.page.register;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;

public class PageGuruSuccess extends CorePage<PageGuruSuccess>{

	public PageGuruSuccess() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")
	private WebElement labelTextSuccess;
	
	public void validateTextSuccess() {		
		assertEquals(labelTextSuccess.getText(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
	}
	
}
