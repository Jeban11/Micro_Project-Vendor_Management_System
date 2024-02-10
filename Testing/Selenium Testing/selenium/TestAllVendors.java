package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllVendors {
	private WebDriver driverAllVendor;

	@BeforeTest
	public void initializer() {
		System.setProperty("webdriver.Chrome.driver", "driver/Chromedriver.exe");
		driverAllVendor = new ChromeDriver();
	}

	@Test
	public void site() {
		driverAllVendor.navigate().to("http://localhost:4200/");
		driverAllVendor.findElement(By.name("login")).click();
		System.out.println(driverAllVendor.getTitle());

		driverAllVendor.findElement(By.name("username")).sendKeys("jeban");
		driverAllVendor.findElement(By.name("password")).sendKeys("11963");
		driverAllVendor.findElement(By.name("signin")).click();
		System.out.println(driverAllVendor.getTitle());
		driverAllVendor.findElement(By.name("vendors")).click();
		driverAllVendor.findElement(By.name("allvendor")).click();
		driverAllVendor.findElement(By.name("my")).click();

	}

	public static void main(String[] args) {
		TestAllVendors obj = new TestAllVendors();
		obj.initializer();
		obj.site();
		
	}
}
