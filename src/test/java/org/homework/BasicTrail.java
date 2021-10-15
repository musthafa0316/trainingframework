package org.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.train.Base;

public class BasicTrail extends Base{

	public static void main(String[] args) {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		fill(userName, "musthu16");
		WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"));
		fill(passWord, "Home@25205869");
		WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
		buttonClick(btnClick);
	}
	
	//basic trail update for github
}
