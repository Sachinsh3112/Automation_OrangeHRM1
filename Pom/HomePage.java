package com.orangehr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[1]")
	private WebElement text;
	
	@FindBy(xpath="//li[@class='oxd-userdropdown']")
	private WebElement button;
	
 @FindBy(xpath="//a[text()='Logout']")
 private WebElement logt;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void SetLogout() throws InterruptedException {
	boolean Exp = text.isDisplayed();
	Assert.assertTrue(Exp);
	button.click();
	Thread.sleep(2000);
	logt.click();
}
}
