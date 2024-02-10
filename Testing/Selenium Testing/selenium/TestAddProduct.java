package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAddProduct {
	WebDriver driverinsert;

	@BeforeTest
	public void initializer() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverinsert = new ChromeDriver();
	}

	@Test
	public void site() {
		driverinsert.navigate().to("http://localhost:4200/");
		driverinsert.findElement(By.name("login")).click();
		System.out.println(driverinsert.getTitle());

		driverinsert.findElement(By.name("username")).sendKeys("jeban");
		driverinsert.findElement(By.name("password")).sendKeys("11963");
		driverinsert.findElement(By.name("signin")).click();
		System.out.println(driverinsert.getTitle());

		driverinsert.findElement(By.name("products")).click();
		driverinsert.findElement(By.name("addproduct")).click();

	}

	@Test
	public void addProduct() {

		WebElement vendorIdField = driverinsert.findElement(By.name("id"));
		vendorIdField.sendKeys("111");

		WebElement vendorNameField = driverinsert.findElement(By.name("cno"));
		vendorNameField.sendKeys("67564");

		WebElement vendorCountryField = driverinsert.findElement(By.name("pname"));
		vendorCountryField.sendKeys("Shoes");

		WebElement cotogoryField = driverinsert.findElement(By.name("price"));
		cotogoryField.sendKeys("12345");

		WebElement productsField = driverinsert.findElement(By.name("brand"));
		productsField .sendKeys("Shoes");

		

		driverinsert.findElement(By.name("insert")).click();
		System.out.println(driverinsert.getTitle());

	}

	public static void main(String[] args) {
		TestAddProduct obj = new TestAddProduct();
		obj.initializer();
		obj.site();
		obj.addProduct();
	}


}
