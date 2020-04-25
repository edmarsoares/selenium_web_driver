package com.thiago.page.register;

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

public class PageGuruRegister extends CorePage<PageGuruRegister>{

	public PageGuruRegister() {
		this.driver = TLDriverFactory.getDriver();
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "firstName")
	private WebElement inputfirstName;
	
	@FindBy(name = "lastName")
	private WebElement inputLastName;
	
	@FindBy(name = "phone")
	private WebElement inputPhone;
	
	@FindBy(name = "userName")
	private WebElement inputEmail;
	
	@FindBy(name = "address1")
	private WebElement inputAddress;
	
	@FindBy(name = "city")
	private WebElement inputCity;
	
	@FindBy(name = "state")
	private WebElement inputState;
	
	@FindBy(name = "postalCode")
	private WebElement inputPostalCode;
	
	@FindBy(name = "country")
	private WebElement selectCountry;
	
	@FindBy(name = "email")
	private WebElement inputLogin;
	
	@FindBy(name = "password")
	private WebElement inputPassword;
	
	@FindBy(name = "confirmPassword")
	private WebElement inputConfirmPassword;
	
	@FindBy(name = "submit")
	private WebElement btnEnviar;
	
	public PageGuruSuccess fillForm() {		
		inputfirstName.sendKeys("edmar");
		inputLastName.sendKeys("soares");
		inputPhone.sendKeys("87770436");
		inputEmail.sendKeys("edmar@gmail");
		inputAddress.sendKeys("rua santo antonio");
		inputCity.sendKeys("cabedelo");
		inputState.sendKeys("PB");
		inputPostalCode.sendKeys("000-000");
		click(selectCountry);
		selectElementByVisibleValue(selectCountry, "ALBANIA");
		
		inputLogin.sendKeys("edmar soares");
		inputPassword.sendKeys("123");
		inputConfirmPassword.sendKeys("123");
		
		click(btnEnviar);
		
		return new PageGuruSuccess();
	}
	
}
