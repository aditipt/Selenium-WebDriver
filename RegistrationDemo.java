package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Mphasis\\\\selenium-java-3.5.0\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement name=driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Yash");
		
		WebElement email=driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("yash@gmail.com");
		
		WebElement phone= driver.findElement(By.cssSelector("#id_cell_phone"));
		phone.sendKeys("1234567890");
		
		WebElement pass=driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("yash@123");
		
		WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
		if(!check.isSelected())
		{
			check.click();
		}
		
		WebElement button= driver.findElement(By.cssSelector("#registerButton"));
		button.submit();
		
	}
}
