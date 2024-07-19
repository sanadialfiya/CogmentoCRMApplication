package Utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {

	public static WebElement visibiltyOf(WebElement wb) {
		return new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.visibilityOf(wb));

	}

	public static void sendkeys(WebElement wb, String value) {
		Wait.visibiltyOf(wb).sendKeys(value);
	}

	public static void click(WebElement wb) {
		new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	public static boolean isDisplayed(WebElement wb)
	{
		return Wait.visibiltyOf(wb).isDisplayed();
	}

}
