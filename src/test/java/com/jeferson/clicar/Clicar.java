package com.jeferson.clicar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Clicar {
    private final WebDriver driver;

    public Clicar(WebDriver driver) {
        this.driver = driver;
    }

    public void tiposClicar() {
        WebElement element = driver.findElement(By.id("fulano"));
        //=========================================================
        element.click();
        //=========================================================
        Actions actions = new Actions(driver);
        actions.click(element).build().perform();
        //=========================================================
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        //=========================================================
    }
}
