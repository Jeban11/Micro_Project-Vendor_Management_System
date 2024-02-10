package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAddContract {
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

		driverinsert.findElement(By.name("contracts")).click();
		driverinsert.findElement(By.name("addcontract")).click();

	}

	@Test
	public void addContract() {

		WebElement vendorIdField = driverinsert.findElement(By.name("id"));
		vendorIdField.sendKeys("11110");

		WebElement vendorNameField = driverinsert.findElement(By.name("name"));
		vendorNameField.sendKeys("Hema");

		WebElement vendorCountryField = driverinsert.findElement(By.name("cno"));
		vendorCountryField.sendKeys("234557");

		WebElement cotogoryField = driverinsert.findElement(By.name("catogory"));
		cotogoryField.sendKeys("leather"
				+ "");

		WebElement productsField = driverinsert.findElement(By.name("products"));
		productsField .sendKeys("Shoes");

		WebElement StatusField = driverinsert.findElement(By.name("status"));
		 StatusField.sendKeys("onboarding");

		WebElement descriptionField = driverinsert.findElement(By.name("description"));
		descriptionField.sendKeys("ready to buy");

		

		driverinsert.findElement(By.name("insert")).click();
		System.out.println(driverinsert.getTitle());

	}

	public static void main(String[] args) {
		TestAddContract obj = new TestAddContract();
		obj.initializer();
		obj.site();
		obj.addContract();
	}

}
