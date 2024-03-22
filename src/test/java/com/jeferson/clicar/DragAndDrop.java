package com.jeferson.clicar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    private final WebDriver driver;

    public DragAndDrop(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop() {
        WebElement elementOrigem = driver.findElement(By.id("fulano1"));
        WebElement elementDestino = driver.findElement(By.id("fulano2"));
        //=========================================================
        Actions action = new Actions(driver);
        action.dragAndDrop(elementOrigem, elementDestino).build().perform();
        action.dragAndDropBy(elementOrigem, 275, 64).build().perform();
        //=========================================================
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(elementOrigem)
                .moveToElement(elementDestino)
                .release(elementDestino)
                .build();
        dragAndDrop.perform();
        //=========================================================
        (new Actions(driver)).dragAndDrop(elementOrigem, elementDestino).perform();
        //=========================================================
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementOrigem).pause(2000).moveToElement(elementDestino)
                .release().build().perform();
        //=========================================================
    }
}
