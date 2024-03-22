package com.jeferson.csv.junit;

import com.jeferson.csv.testNG.DataClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class CsvFile {

    /**
     * Adiciona dependencia "junit-jupiter-params"
     * Adiciona pasta resources e criar arquivo "fulano.csv"
     * Mais inforamações acessar https://www.baeldung.com/parameterized-tests-junit-5
    **/

    @ParameterizedTest
    @CsvFileSource(resources = "/fulano.csv", numLinesToSkip = 1)
    public void entrarLogin(String usuario, String senha) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.juliodelima.com.br/taskit/");
        WebElement signIn = driver.findElement(By.cssSelector(".modal-trigger"));
        signIn.click();

        WebElement login = driver.findElement(By.cssSelector("#signinbox input[name='login']"));
        login.sendKeys(usuario);

        WebElement password = driver.findElement(By.cssSelector("#signinbox input[name='password']"));
        password.sendKeys(senha);

        WebElement entrar = driver.findElement(By.cssSelector("#signinbox a"));
        entrar.click();

        driver.quit();
    }


    /** usa estratégia CSV para testNG (veja ligação com 'com.jeferson.csv.testNG'**/
    @Test(dataProvider = "loginWithCSV", dataProviderClass = DataClass.class)
    public void csv(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);
    }

}
