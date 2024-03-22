package com.jeferson.reports.report2;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.annotations.Test;

import java.io.IOException;

public class TESTE3 extends BaseTest {

    @Test
    public void extentTest() {

        ExtentReport.createTest("TESTE3");

        ExtentReport.test.pass("TESTE3");
        ExtentReport.test.info("Report anotações com classe BaseTest");
        ExtentReport.test.pass(MarkupHelper.createLabel("Passou completo", ExtentColor.GREEN));

    }
}
