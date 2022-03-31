package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fac {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\face\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
		txtusername.sendKeys("srithar");
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpassword.sendKeys("123456");
		
		WebElement buttonlogin = driver.findElement(By.xpath("//button[@name='login']"));
		buttonlogin.click();
		
		
		
		
	}

}
