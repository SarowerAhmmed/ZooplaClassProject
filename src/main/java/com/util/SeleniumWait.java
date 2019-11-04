package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	public static void getExplicitwait(WebDriver driver, WebElement element) {

		
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	
	public static void getSleep(WebElement element) {
		
		
		int time = 0;

		while (time < 60000) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
			
			if(element.getSize().height>0) {
				
				break;
				
			}
			
			time++;

		}
	}
}
