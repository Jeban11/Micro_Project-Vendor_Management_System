package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogin {
	@Test
	public void openLogin() {
		WebDriver driverInsert;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverInsert = new ChromeDriver();
		driverInsert.navigate().to("http://localhost:4200/");
		driverInsert.findElement(By.name("login")).click();
		System.out.println(driverInsert.getTitle());
		
		driverInsert.findElement(By.name("username")).sendKeys("jeban");
		driverInsert.findElement(By.name("password")).sendKeys("11963");
		driverInsert.findElement(By.name("signin")).click();
		System.out.println(driverInsert.getTitle());
		
	}
	public static void main(String[] args) {
		TestLogin obj = new TestLogin();
		obj.openLogin();
	}


}
