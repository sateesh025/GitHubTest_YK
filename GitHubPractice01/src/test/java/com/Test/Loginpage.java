package com.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage {
	WebDriver d;
	@Test
	public void login(){
		System.out.println("Login page megthod");
	}
	@Test
	public void createAccount() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
		d = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\new\\Desktop\\IEDriverServer.exe");
		//d= new InternetExplorerDriver();
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("test");
		d.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("QA");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div/input[@name='reg_email__']")).sendKeys("kunaneeru@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div/input[@name='reg_email_confirmation__']")).sendKeys("kunaneeru@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("kunaparedd123");
	}
}
