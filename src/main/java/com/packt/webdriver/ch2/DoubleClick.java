package com.packt.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class DoubleClick {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 2/HTML/DoubleClick.html");

        WebElement dblClick = driver.findElement(By.name("dblClick"));
        Actions builder = new Actions(driver);
//        builder.moveToElement(dblClick)
//                .doubleClick()
//                .perform();
        builder.doubleClick(dblClick).perform();
    }
}
