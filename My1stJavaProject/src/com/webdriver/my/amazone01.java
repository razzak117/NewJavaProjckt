package com.webdriver.my;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazone01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\razza\\OneDrive\\Desktop\\SeleniumWD\\Chrome\\v108\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pcrichard.com/");
		

	}

}
