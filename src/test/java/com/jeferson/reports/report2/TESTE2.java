package com.jeferson.reports.report2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TESTE2 {

    private static ExtentReports extent;
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); //html file will be generated
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Report");
        spark.config().setReportName("Automation Practice");

        extent.attachReporter(spark);
    }

    @AfterMethod
    public void tearDown() throws IOException {
        extent.flush();
        Desktop.getDesktop().browse(new File("index.html").toURI());
    }

    @Test
    public void extentTest() throws IOException {

        ExtentTest test = extent.createTest("Login Test");
        test.pass("TESTE2");
        test.info("Report com anotação cadas metodos dentro classe está ok");
        test.pass(MarkupHelper.createLabel("Passou completo", ExtentColor.GREEN));

    }
}
