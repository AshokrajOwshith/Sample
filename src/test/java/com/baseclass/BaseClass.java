package com.baseclass;

import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
//import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.cucumber.java.it.Date;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static WebDriver driver;
	public static Actions action;
	public static Select select;
	public void lanuchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	public void type(WebElement element,String value) 
	{
		element.sendKeys(value);
	}
	public void loadUrl(String url) 
	{
		driver.get(url);
	}
	public void btnClick(WebElement element)
	{
		element.click();
	}
	public String getTextMessage(WebElement element) 
	{
		return element.getText();
	}
	public String getCurrentUrl() 
	{
		return driver.getCurrentUrl();
	}
	public void quitBrowser()
	{
		driver.quit();
	}
	public void closeCurrentPage()
	{
		driver.close();
	}
	public String getCurrentWindow()
	{
		return driver.getWindowHandle();
	}
	public Set<String> getAllWindows()
	{
		return driver.getWindowHandles();
	}
	public void previousWindowSwitch() 
	{
		
	}
	public String getPageUrl() 
	{
		return driver.getCurrentUrl();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
		 
	}
	public String getText(WebElement element) 
	{
		return element.getText();
	}
	public void submit(WebElement element) 
	{
		element.submit();
	}
	public void driverWait() throws InterruptedException
	{
		driver.wait();
//		element.wait();
	}
	public void click() 
	{
		action.click().perform();
	}
	public void doubleClick() 
	{
		action.doubleClick().perform();
	}
	public void rightClick() 
	{
		action.contextClick().perform();
	}
	public void getDriverScreenshot(String fileLoc ) throws IOException 
	{
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File s =screenShot.getScreenshotAs(OutputType.FILE);
		File d = new File(fileLoc);
		FileUtils.copyFile(s, d);
	}
	public void getParticularElementScreenshot(String fileLoc ) throws IOException 
	{
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File s =screenShot.getScreenshotAs(OutputType.FILE);
		File d = new File(fileLoc);
		FileUtils.copyFile(s, d);
	}
//	public String getDataFromExcel(String eLoc, String sName, int rNo,int cNo) throws IOException 
//	{
//		String value = null;
//		File excelLoc = new File(eLoc);
//		FileInputStream fIn = new FileInputStream(excelLoc);
//		Workbook w = new XSSFWorkbook(fIn);
//		Sheet s = w.getSheet(sName);
//		Row r = s.getRow(rNo);
//		Cell c = r.getCell(cNo);
//		int type = c.getCellType();
//		if (type==1)
//		{
//			value = c.getStringCellValue();
//		}
//		else if (type==0)
//		{
//			if(DateUtil.isCellDateFormatted(c))
//			{
//				Date date = c.getDateCellValue();
//				SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
//				value = sdf.format(date);
//			}
//			else 
//			{
//				double numeric = c.getNumericCellValue();
//				long l = (long)numeric;
//				value = String.valueOf(l);
//			}
//		}
//		return value;
//	}
	public void navigateUrlPass(String url) throws InterruptedException 
	{
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	public void navigateMinimize() throws InterruptedException
	{
		driver.manage().window().minimize();
		Thread.sleep(3000);
	}
	public void navigateBackward() throws InterruptedException 
	{
		driver.navigate().back();
		Thread.sleep(3000);

	}
	public void navigateForward() throws InterruptedException
	{
		driver.navigate().forward();
		Thread.sleep(3000);

	}
	public void navigateRefresh() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(3000);

	}
	public void selectIndex(WebElement btnLoc,int value)
	{
		select = new Select(btnLoc);
		select.selectByIndex(value);
	}
	public void selectvalue(WebElement btnLocation,String value)
	{
		select = new Select(btnLocation);
		select.selectByValue(value);
	}
	public void selectTxt(WebElement btnLocation,String text)
	{
		select = new Select(btnLocation);
		select.selectByVisibleText(text);
	}
	public void selectopitions(int size)
	{
		List<WebElement> options = select.getOptions();
		int getsize = options.size();
		System.out.println(getsize);
		WebElement element = options.get(size);
		System.out.println(element);
	}
	public void getAttributeText(WebElement element) 
	{
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

}
