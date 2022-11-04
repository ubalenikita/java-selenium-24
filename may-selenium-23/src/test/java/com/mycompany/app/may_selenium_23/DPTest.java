package com.mycompany.app.may_selenium_23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPTest {
	public WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String userid, String password) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Desktop\\my-app-selenium\\binary\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.testyou.in/Login.aspx");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement UserName1 = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']"));
		  WebElement Password1 = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']"));
		  WebElement StaySignIn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_chkRememberMe']"));
		  WebElement LogInBtn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']"));
		  UserName1.sendKeys(userid);
		  Password1.sendKeys(password);
		  StaySignIn.click();
		  LogInBtn.click();
	  }

	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "omkarbawkar@gmail.com", "a12567" },
	      new Object[] { "omkarbawkar123@gmail.com", "1456b" },
	      new Object[] { "8845795213", "14gs56b" },
	    };
	  }
	}
