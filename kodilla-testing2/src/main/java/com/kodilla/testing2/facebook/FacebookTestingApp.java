package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR= "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main (String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement dayField = driver.findElement(By.xpath(XPATH_DAY));
        dayField.sendKeys("25");
        WebElement monthField = driver.findElement(By.xpath(XPATH_MONTH));
        monthField.sendKeys("gru");
        WebElement yearField = driver.findElement(By.xpath(XPATH_YEAR));
        yearField.sendKeys("1989");

    }
}
