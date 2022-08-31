package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPojo extends BaseClass
{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement passWord;
	@FindBy(name="login")
	private WebElement btnLogin;
	@FindBy(xpath="//div[contains(text(),'incorrect')]")
	private WebElement errorMsg;
	@FindBy(xpath="//a[contains(text(),'Create New')]")
	private WebElement createNew;
	@FindBy(xpath="//div[text()='Sign Up']")
	private WebElement signUp;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	public WebElement getCreateNew() {
		return createNew;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	
	
	
}
