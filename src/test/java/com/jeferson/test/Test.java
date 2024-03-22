package com.jeferson.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    @org.junit.jupiter.api.Test
    public void teste(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.juliodelima.com.br/taskit/");
        WebElement signIn = driver.findElement(By.cssSelector(".modal-trigger"));
        signIn.click();
        WebElement login = driver.findElement(By.cssSelector("#signinbox input[name='login']"));
        login.sendKeys("julio0001");
        WebElement password = driver.findElement(By.cssSelector("#signinbox input[name='password']"));
        password.sendKeys("123456");
        WebElement entrar = driver.findElement(By.cssSelector("#signinbox a"));
        entrar.click();

    }
}
