package com.thiago.page.login;

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
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")
	private WebElement textSucces;
		
	
	public void validatePageSuccess() {
		aguardarElementoVisivel(textSucces);
		
		assertEquals("Note: Your user name is edmar soares.", textSucces.getText());
	}
	
}
