package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVendorDelete {
	private WebDriver driverdelete;

	@BeforeTest
	public void initializer() {
		System.setProperty("webdriver.Chrome.driver", "driver/Chromedriver.exe");
		driverdelete = new ChromeDriver();
	}

	@Test
	public void site() {
		driverdelete.navigate().to("http://localhost:4200/");
		driverdelete.findElement(By.name("login")).click();
		System.out.println(driverdelete.getTitle());
		
		driverdelete.findElement(By.name("username")).sendKeys("jeban");
		driverdelete.findElement(By.name("password")).sendKeys("11963");
		driverdelete.findElement(By.name("signin")).click();
		System.out.println(driverdelete.getTitle());
		driverdelete.findElement(By.name("vendors")).click();
		driverdelete.findElement(By.name("addvendor")).click();
	}

	@Test
	public void testvendorFormSubmission() {

		WebElement vendorIdField = driverdelete.findElement(By.name("id"));
		vendorIdField.sendKeys("1907");

		driverdelete.findElement(By.name("delete")).click();
        System.out.println(driverdelete.getTitle());

	}
	
	public static void main(String[] args) {
		TestVendorDelete obj = new TestVendorDelete();
		obj.initializer();
		obj.site();
		obj.testvendorFormSubmission();
	}

}
