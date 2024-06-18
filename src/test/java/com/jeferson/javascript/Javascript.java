package com.jeferson.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript {
    WebDriver driver;

    /** Clica para Javascript **/
    public void javascriptClick() {
        WebElement element = driver.findElement(By.id("fulano"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    /** Movimento mouse para Javascript **/
    public void javascriptScroll() {
        WebElement element = driver.findElement(By.id("fulano"));
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
    }

    /** Procura elemento para Javascript **/
    public void javascriptFindElement() {
        WebElement element = driver.findElement(By.id("fulano"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    /** Aguardo tempo para Javascript **/
    public void javascriptWaitElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
    }
}
