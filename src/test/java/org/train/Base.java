package org.train;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static void launchChrome() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	public static void loadUrl(String Url) {
		driver.get(Url);
	}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	public static void printTitle() {
	System.out.println(driver.getTitle());
	}
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void buttonClick(WebElement ele) {
		ele.click();		
	}
	public static void dragDrop(WebElement src, WebElement tgt) {
		a = new Actions(driver);
	a.dragAndDrop(src, tgt);
	}
	public static void moveElement(WebElement target) {
		a.moveToElement(target);
	}
	public static void dClick(WebElement target) {
		a.doubleClick(target);
	}
	public static void rClick(WebElement target) {
		a.contextClick(target);
	}
	public static void keyEnter() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void keyDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void selectByText(String text) {
		Select s=new Select(null);
		s.selectByVisibleText(text);
	}
	public static void selectByValue(String value) {
		s.selectByValue(value);
	}
	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}
	public static void isMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public static void deselectByValue(String value) {
		s.deselectByValue(value);
	}
	public static void deselectByVisibleText(String value) {
		s.deselectByVisibleText(value);
	}
	public static void deselectByIndex(int index) {
		s.deselectByIndex(index);
	}
	public static void deselectAll() {
		s.deselectAll();
	}
	public static void getOptions() {
		List<WebElement> li = s.getOptions();
		for (int i = 0; i < li.size(); i++) {
			WebElement ele = li.get(i);
			String text = ele.getText();
			System.out.println(text);
			
		}
	}
	public static void getAllSelectedOptions() {
		List<WebElement> lis = s.getAllSelectedOptions();
		for (int i = 0; i < lis.size(); i++) {
			WebElement ele = lis.get(i);
			String text = ele.getText();
			System.out.println(text);
			
		}
	}
	public static void getFirstSelectedOptions() {
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
	}
	
	
	

}
