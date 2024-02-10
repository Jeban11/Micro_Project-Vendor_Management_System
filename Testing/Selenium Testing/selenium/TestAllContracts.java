package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllContracts {
	private WebDriver driverAllContract;

	@BeforeTest
	public void initializer() {
		System.setProperty("webdriver.Chrome.driver", "driver/Chromedriver.exe");
		driverAllContract = new ChromeDriver();
	}

	@Test
	public void site() {
		driverAllContract.navigate().to("http://localhost:4200/");
		driverAllContract.findElement(By.name("login")).click();
		System.out.println(driverAllContract.getTitle());
		
		driverAllContract.findElement(By.name("username")).sendKeys("jeban");
		driverAllContract.findElement(By.name("password")).sendKeys("11963");
		driverAllContract.findElement(By.name("signin")).click();
		System.out.println(driverAllContract.getTitle());
		driverAllContract.findElement(By.name("contracts")).click();
		driverAllContract.findElement(By.name("allcontract")).click();
//		driverAllVendor.findElement(By.name("my")).click();

	}

	public static void main(String[] args) {
		TestAllContracts obj = new TestAllContracts();
		obj.initializer();
		obj.site();

	}

}
