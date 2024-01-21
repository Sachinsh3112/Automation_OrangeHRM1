package com.orangehr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="(//input)[2]")
	private WebElement Email;

	@FindBy(xpath="(//input)[3]")
	private WebElement Pass;

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement lgbtn;

	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void SetLogin(String un,String psw ) throws InterruptedException {
	Email.sendKeys(un);
	Thread.sleep(2000);
	Pass.sendKeys(psw);
	Thread.sleep(2000);
	lgbtn.click();

	}
}
