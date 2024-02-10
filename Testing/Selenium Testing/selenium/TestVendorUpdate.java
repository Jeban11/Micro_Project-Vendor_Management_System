package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVendorUpdate {

	WebDriver driverUpdate;

	@BeforeTest
	public void initializer() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverUpdate = new ChromeDriver();
	}

	@Test
	public void site() {
		driverUpdate.navigate().to("http://localhost:4200/");
		driverUpdate.findElement(By.name("login")).click();
		System.out.println(driverUpdate.getTitle());

		driverUpdate.findElement(By.name("username")).sendKeys("jeban");
		driverUpdate.findElement(By.name("password")).sendKeys("11963");
		driverUpdate.findElement(By.name("signin")).click();
		System.out.println(driverUpdate.getTitle());

		driverUpdate.findElement(By.name("vendors")).click();
		driverUpdate.findElement(By.name("addvendor")).click();

	}

	@Test
	public void updateVendor() {

		WebElement vendorIdField = driverUpdate.findElement(By.name("id"));
		vendorIdField.sendKeys("11908");

		WebElement vendorNameField = driverUpdate.findElement(By.name("name"));
		vendorNameField.sendKeys("Hema");

		WebElement vendorCountryField = driverUpdate.findElement(By.name("country"));
		vendorCountryField.sendKeys("England");

		WebElement companyRegNoField = driverUpdate.findElement(By.name("company"));
		companyRegNoField.sendKeys("RTZ123");

		WebElement vendorstockField = driverUpdate.findElement(By.name("ssymbol"));
		vendorstockField.sendKeys("#456");

		WebElement RelationshipField = driverUpdate.findElement(By.name("realationship"));
		RelationshipField.sendKeys("2000");

		WebElement vendorEmailField = driverUpdate.findElement(By.name("email"));
		vendorEmailField.sendKeys("h@gmail.com");

		WebElement vendorMobileField = driverUpdate.findElement(By.name("mobile"));
		vendorMobileField.sendKeys("9078567890");

		driverUpdate.findElement(By.name("update")).click();
		System.out.println(driverUpdate.getTitle());

	}

	public static void main(String[] args) {
		TestVendorUpdate obj = new TestVendorUpdate();
		obj.initializer();
		obj.site();
		obj.updateVendor();
	}

}
