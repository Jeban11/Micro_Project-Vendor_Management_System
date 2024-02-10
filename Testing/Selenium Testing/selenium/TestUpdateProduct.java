package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUpdateProduct {
	WebDriver driverupdate;

	@BeforeTest
	public void initializer() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverupdate = new ChromeDriver();
	}

	@Test
	public void site() {
		driverupdate.navigate().to("http://localhost:4200/");
		driverupdate.findElement(By.name("login")).click();
		System.out.println(driverupdate.getTitle());

		driverupdate.findElement(By.name("username")).sendKeys("jeban");
		driverupdate.findElement(By.name("password")).sendKeys("11963");
		driverupdate.findElement(By.name("signin")).click();
		System.out.println(driverupdate.getTitle());

		driverupdate.findElement(By.name("products")).click();
		driverupdate.findElement(By.name("addproduct")).click();

	}

	@Test
	public void updateProduct() {

		WebElement vendorIdField = driverupdate.findElement(By.name("id"));
		vendorIdField.sendKeys("111");

		WebElement vendorNameField = driverupdate.findElement(By.name("cno"));
		vendorNameField.sendKeys("67564");

		WebElement vendorCountryField = driverupdate.findElement(By.name("pname"));
		vendorCountryField.sendKeys("Shirts");

		WebElement cotogoryField = driverupdate.findElement(By.name("price"));
		cotogoryField.sendKeys("12345");

		WebElement productsField = driverupdate.findElement(By.name("brand"));
		productsField .sendKeys("Shoes");

		

		driverupdate.findElement(By.name("update")).click();
		System.out.println(driverupdate.getTitle());

	}

	public static void main(String[] args) {
		TestUpdateProduct obj = new TestUpdateProduct();
		obj.initializer();
		obj.site();
		obj.updateProduct();
	}

}
