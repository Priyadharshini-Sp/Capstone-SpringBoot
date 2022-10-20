package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {
	WebDriver wd;
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
		 wd=new ChromeDriver();
		wd.manage().window().maximize();
	}
  @Test
  public void AdminRegister() throws InterruptedException {
	  wd.get("http://localhost:4200/adminregister");
	  wd.findElement(By.id("name")).sendKeys("Micky");
	  wd.findElement(By.id("password-field")).sendKeys("Micky@123");
	  wd.findElement(By.id("mail")).sendKeys("mickey@gmail.com");
	 
  }
  @Test
  public void AdminLogin() throws InterruptedException {
	  wd.get("http://localhost:4200/adminlogin");
	  wd.findElement(By.id("name")).sendKeys("Micky");
	  wd.findElement(By.id("password-field")).sendKeys("Micky@123");
	  
  }
  @Test
  public void UserRegistration() throws InterruptedException {
	  wd.get("http://localhost:4200/userregister");
	  wd.findElement(By.id("name")).sendKeys("Bravo");
	  wd.findElement(By.id("password-field")).sendKeys("Bravo@123");
	  wd.findElement(By.id("mail")).sendKeys("Bravospark@gmail.com");
	  wd.findElement(By.id("contact")).sendKeys("9976345634");
	  wd.findElement(By.id("location")).sendKeys("Ahamadabad");
	  Thread.sleep(9000);
  }
  @Test
  public void UserLogin() throws InterruptedException {
	  wd.get("http://localhost:4200/userlogin");
	  wd.findElement(By.id("name")).sendKeys("Bravo");
	  wd.findElement(By.id("password-field")).sendKeys("Bravo@123");
	  
  }
  @Test
  public void CarRegistration() throws InterruptedException {
	  wd.get("http://localhost:4200/usercar");
	  wd.findElement(By.id("name")).sendKeys("Isuzki");
	  wd.findElement(By.id("des")).sendKeys("Bought before 17 yrs");
	  wd.findElement(By.id("price")).sendKeys("100000");
	  wd.findElement(By.id("offers")).sendKeys("6%");
	  wd.findElement(By.id("location")).sendKeys("Kerala");
	  wd.findElement(By.id("owner")).sendKeys("Izakai");
	 
  }
  @AfterTest
  public void init1() {
	  wd.quit();
  }
}
