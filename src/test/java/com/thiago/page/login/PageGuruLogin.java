package com.thiago.page.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;

public class PageGuruLogin extends CorePage<PageGuruLogin>{

	public PageGuruLogin() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement inputEmail;
	
	@FindBy(id = "passwd")
	private WebElement inputPassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement bntSigIn;
	
	
	public PageGuruSuccess logar(String email, String password) {
		preencherCampo(inputEmail, email);
		preencherCampo(inputPassword, password);
		click(bntSigIn);
		
		return new PageGuruSuccess();
	}
	
}
