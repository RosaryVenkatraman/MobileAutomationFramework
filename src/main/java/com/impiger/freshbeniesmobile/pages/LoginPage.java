package com.impiger.freshbeniesmobile.pages;

import com.impiger.freshbeniesmobile.testdata.Constants;
import com.impiger.util.ElementActions;
import com.impiger.util.TimeUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends ElementActions {
	
	//public static AppiumDriverLocalService service;
	//Properties props=new Properties();
	
	@AndroidFindBy(id="login_btn")
	@iOSXCUITFindBy (id = "login_btn")
	MobileElement signin;
	
	@AndroidFindBy(id="email")
	MobileElement username;
	
	@AndroidFindBy(id="password")
	MobileElement password;
	
	@AndroidFindBy(id="email_sign_in_button")
	MobileElement loginbtn;
	
	@AndroidFindBy(id="android:id/message")
	MobileElement loginerror;
	
	@AndroidFindBy(id="forgot_pass_textview")
	MobileElement forgotpwd;
	
	
		
	public void signin(){
		TimeUtil.shortWait();
    		click(signin);
           
		}
		//elementaction.doClickByWebElement(signin);
		
		
	
	public void enterInvalidCredentials(){
		sendKeys(username, Constants.invalid_username);
		sendKeys(password, Constants.invalid_pwd);
		click(loginbtn);
		TimeUtil.shortWait();
	}
	
	public boolean verifyLoginerror_msg(){
		waitForVisibility(loginerror);
		TimeUtil.shortWait();
		return loginerror.isDisplayed();
	}
	
	
	
	public boolean forgotpwdDisplay(){
		waitForVisibility(forgotpwd);
		return forgotpwd.isDisplayed();
	}

	public HomePage enterValidCredentials(){
		sendKeys(username,Constants.valid_username);
		sendKeys(password,Constants.valid_pwd );
		click(loginbtn);
		TimeUtil.mediumWait();
		return new HomePage();
	}
	
}
