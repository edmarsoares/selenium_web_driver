package com.thiago.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;

public class PageDeleteCustomer extends CorePage<PageDeleteCustomer>{

	public PageDeleteCustomer() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "cusid")
	private WebElement inputTextId;
	
	@FindBy(name = "submit")
	private WebElement bntSubmit;
	
	public void preencherCampoDelete() {
		preencherCampo(inputTextId,"automação");
		click(bntSubmit);
		System.out.println(getAlert());
		
		Assert.assertEquals(getAlert(), "Do you really want to delete this Customer?");
	}
	
}
