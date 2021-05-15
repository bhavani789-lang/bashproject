package com.myproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class extentreport {
@Test
public void m1()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("rameshadepu");
	driver.findElement(By.id("password")).sendKeys("ramesh");
	driver.findElement(By.id("login")).click();
}
}
