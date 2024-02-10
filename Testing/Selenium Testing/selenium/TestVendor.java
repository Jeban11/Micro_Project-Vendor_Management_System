package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestVendor {
	
	
	@Test
	public void insertVendor() {
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
		
		driverInsert.findElement(By.name("vendors")).click();
		driverInsert.findElement(By.name("addvendor")).click();
		
		
		WebElement vendorIdField = driverInsert.findElement(By.name("id"));
		vendorIdField.sendKeys("11909");

		WebElement vendorNameField = driverInsert.findElement(By.name("name"));
		vendorNameField.sendKeys("Naveen");

		WebElement vendorCountryField = driverInsert.findElement(By.name("country"));
		vendorCountryField.sendKeys("India");

		WebElement companyRegNoField = driverInsert.findElement(By.name("company"));
		companyRegNoField.sendKeys("RTZ123");

		WebElement vendorstockField = driverInsert.findElement(By.name("ssymbol"));
		vendorstockField.sendKeys("#456");
		
		WebElement RelationshipField = driverInsert.findElement(By.name("realationship"));
		RelationshipField.sendKeys("1999");
		
		WebElement vendorEmailField = driverInsert.findElement(By.name("email"));
		vendorEmailField.sendKeys("h@gmail.com");
		

		WebElement vendorMobileField = driverInsert.findElement(By.name("mobile"));
		vendorMobileField.sendKeys("9078567890");
		


		WebElement insert = driverInsert.findElement(By.xpath("//button[@value='Insert']"));
		insert.click();
		
		
		
	}
	
	public static void main(String[] args) {
		TestVendor obj = new TestVendor();
		obj.insertVendor();
	}


}
