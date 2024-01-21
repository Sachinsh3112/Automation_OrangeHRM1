package com.orange.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
@BeforeClass
public void OpenBrowser(){
	Reporter.log("OpenBrowser", true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@BeforeMethod
public void Login() throws IOException, InterruptedException {
	Reporter.log("Login", true);
	 fis=new FileInputStream("./data/demo.orangehrml.txt");
	 p=new Properties();
	p.load(fis);
	String URL=p.getProperty("url");
	driver.get(URL);
	}

@AfterMethod
public void logOut() throws InterruptedException {
	Reporter.log("HomePAge", true);
		
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("CloseBrowser", true);
	driver.quit();
}
}

