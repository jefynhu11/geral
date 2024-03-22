package com.jeferson.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MenuSelect {

    private final WebDriver driver;

    public MenuSelect(WebDriver driver) {
        this.driver = driver;
    }

    public Select skillsSelect() {
        return new Select(driver.findElement(By.id("Skills")));
    }
}
