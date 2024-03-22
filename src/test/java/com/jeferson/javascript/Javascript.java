package com.jeferson.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript {
    WebDriver driver;
    public void javascriptClick() {
        WebElement element = driver.findElement(By.id("fulano"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    public void javascriptScroll() {
        WebElement element = driver.findElement(By.id("fulano"));
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
    }
    public void javascriptFindElement() {
        WebElement element = driver.findElement(By.id("fulano"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
