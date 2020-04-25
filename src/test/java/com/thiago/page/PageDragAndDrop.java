package com.thiago.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import com.thiago.page.login.PageGuruLogin;
import com.thiago.page.login.PageGuruSuccess;

public class PageDragAndDrop extends CorePage<PageDragAndDrop>{

	public PageDragAndDrop() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"credit1\"]/a")
	private WebElement dragSales;
	
	@FindBy(xpath = "//*[@id=\"credit2\"]/a")
	private WebElement dragBank;
	
	@FindBy(xpath = "//*[@id=\"fourth\"]/a")
	private WebElement dragValue;
	
	@FindBy(xpath = "//*[@id=\"bank\"]/li")
	private WebElement accountDebit;
	
	@FindBy(xpath = "//*[@id=\"loan\"]/li")
	private WebElement accountCredit;
	
	@FindBy(xpath = "//*[@id=\"amt7\"]/li")
	private WebElement amountDebit;
	
	@FindBy(xpath = "//*[@id=\"amt8\"]/li")
	private WebElement amountCredit;
	
	@FindBy(xpath = "//*[@id=\"equal\"]/a")
	private WebElement btnPerfect;
	
	public void validateDrangAndDrop() {		
		dragAndDrop(dragBank, accountDebit);
		dragAndDrop(dragSales, accountCredit);
		dragAndDrop(dragValue, amountDebit);
		dragAndDrop(dragValue, amountCredit);
		
		aguardarElementoVisivel(btnPerfect);
		System.out.println(btnPerfect.getText());
		assertEquals(btnPerfect.getText(), "Perfect!");
	}
	
}
