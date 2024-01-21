package com.orangehr.in;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.generic.BaseClass;
import com.orangehr.pom.HomePage;
import com.orangehr.pom.LoginPage;

public class CreateCust extends BaseClass{
	@Test(dataProvider="loginTestData")
	public void TestLogin(String un,String psw) throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Login", true);
		LoginPage l=new LoginPage(driver);
		l.SetLogin(un,psw);
		HomePage h=new HomePage(driver);
		 Thread.sleep(2000);
		 h.SetLogout();
	}
		@DataProvider(name="loginTestData")
		public Object[][] loginData( ) {
			Object[][] data=new Object[8][2];
			data[0][0]="Admin";
			data[0][1]="admin123";
			
			data[1][0]="Admin";
			data[1][1]="advsds145";
			
			data[2][0]="Dasgse";
			data[2][1]="admin123";
			
			data[3][0]="Dasgse";
			data[3][1]="sadmin14";
			
			data[4][0]="Dasgse";
			data[4][1]="";
			
			data[5][0]="";
			data[5][1]="";
			
			data[6][0]="";
			data[6][1]="admin123";
			
			data[7][0]="";
			data[7][1]="cdas142";
			
			return data;
		}
		
		
}
