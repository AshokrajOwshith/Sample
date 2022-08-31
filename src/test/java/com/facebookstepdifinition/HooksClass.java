package com.facebookstepdifinition;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass
{
	@Before
	public void beforeExecution() 
	{
		lanuchBrowser();
		windowMaximize();
		loadUrl("https://www.facebook.com/");
	}
	@After
	public void afterExecution() throws InterruptedException
	{
		System.out.println("All Testing Compeleted");
		Thread.sleep(3000);
		quitBrowser();
	}
}
