package com.vms.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUpdateContract {
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

		driverupdate.findElement(By.name("contracts")).click();
		driverupdate.findElement(By.name("addcontract")).click();

	}

	@Test
	public void updateContract() {

		WebElement vendorIdField = driverupdate.findElement(By.name("id"));
		vendorIdField.sendKeys("11110");

		WebElement vendorNameField = driverupdate.findElement(By.name("name"));
		vendorNameField.sendKeys("Hema");

		WebElement vendorCountryField = driverupdate.findElement(By.name("cno"));
		vendorCountryField.sendKeys("234557");

		WebElement cotogoryField = driverupdate.findElement(By.name("catogory"));
		cotogoryField.sendKeys("leather"
				+ "");

		WebElement productsField = driverupdate.findElement(By.name("products"));
		productsField .sendKeys("Shoes");

		WebElement StatusField = driverupdate.findElement(By.name("status"));
		 StatusField.sendKeys("onboarding");

		WebElement descriptionField = driverupdate.findElement(By.name("description"));
		descriptionField.sendKeys("ready to buy");

		

		driverupdate.findElement(By.name("update")).click();
		System.out.println(driverupdate.getTitle());

	}

	public static void main(String[] args) {
		TestUpdateContract obj = new TestUpdateContract();
		obj.initializer();
		obj.site();
		obj.updateContract();
	}
	

}
