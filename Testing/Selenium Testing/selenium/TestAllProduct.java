package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllProduct {
	private WebDriver driverAllProduct;

	@BeforeTest
	public void initializer() {
		System.setProperty("webdriver.Chrome.driver", "driver/Chromedriver.exe");
		driverAllProduct = new ChromeDriver();
	}

	@Test
	public void site() {
		driverAllProduct.navigate().to("http://localhost:4200/");
		driverAllProduct.findElement(By.name("login")).click();
		System.out.println(driverAllProduct.getTitle());
		
		driverAllProduct.findElement(By.name("username")).sendKeys("jeban");
		driverAllProduct.findElement(By.name("password")).sendKeys("11963");
		driverAllProduct.findElement(By.name("signin")).click();
		System.out.println(driverAllProduct.getTitle());
		driverAllProduct.findElement(By.name("products")).click();
		driverAllProduct.findElement(By.name("allproducts")).click();


	}

	public static void main(String[] args) {
		TestAllProduct obj = new TestAllProduct();
		obj.initializer();
		obj.site();

	}


}
