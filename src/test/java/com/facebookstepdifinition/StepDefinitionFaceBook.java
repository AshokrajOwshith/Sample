package com.facebookstepdifinition;
import com.baseclass.BaseClass;
import com.pojo.LoginPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFaceBook extends BaseClass
{
	public static LoginPojo lp;
	@Given("User Lanuch FaceBook Application")
	public void user_Lanuch_FaceBook_Application() 
	{
String m = "mani";
	}
	@When("User verify login page is displayed")
	public void user_verify_login_page_is_displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	String currentUrl = getCurrentUrl();
	boolean b = currentUrl.contains("facebook");
	System.out.println(b);
	}
	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password()
	{
		lp = new LoginPojo();
		type(lp.getUserName(),"ashok");
		type(lp.getPassWord(),"123@ashok");
	}
	@When("User click login button")
	public void user_click_login_button() 
	{
	lp = new LoginPojo();
	btnClick(lp.getBtnLogin());
	}
	@Then("User verify error message displayed")
	public void user_verify_error_message_displayed() throws InterruptedException
	{
		Thread.sleep(5000);
	lp=new LoginPojo();
	String message = getTextMessage(lp.getErrorMsg());
	boolean b = message.contains("incorrect");
	System.out.println(b);
	}
	@When("User click CreateNew Account button")
	public void user_click_CreateNew_Account_button() 
	{
		lp = new LoginPojo();
		btnClick(lp.getCreateNew());
	}
	@Then("User verify sign up text is displayed")
	public void user_verify_sign_up_text_is_displayed() throws InterruptedException
	{
		Thread.sleep(5000);
		lp = new LoginPojo();
		String message = getTextMessage(lp.getSignUp());
		boolean b = message.contains("Sign Up");
		System.out.println(b);
	}
	@When("User enters invalid {string} ,and {string}")
	public void user_enters_invalid_and(String string, String string2) 
	{
	lp = new LoginPojo();
	type(lp.getUserName(), string);
	type(lp.getPassWord(), string2);
	}
	@Then("User verify error message is displayed")
	public void user_verify_error_message_is_displayed() throws InterruptedException
	{
		Thread.sleep(5000);
		lp=new LoginPojo();
		String message = getTextMessage(lp.getErrorMsg());
		boolean b = message.contains("incorrect");
	
		System.out.println(b);
	}
}
