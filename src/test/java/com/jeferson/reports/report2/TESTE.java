package com.jeferson.reports.report2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TESTE {

    @Test
    public void extentTest() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); //html file will be generated
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Report");
        spark.config().setReportName("Automation Practice");

        extent.attachReporter(spark);

        ExtentTest test = extent.createTest("Login Test");
        test.pass("TESTE");
        test.info("Report setUp e tearDown estão dentro metodo e está ok");
        test.pass(MarkupHelper.createLabel("Passou completo", ExtentColor.GREEN));

        extent.flush();

        Desktop.getDesktop().browse(new File("index.html").toURI());
    }
}
