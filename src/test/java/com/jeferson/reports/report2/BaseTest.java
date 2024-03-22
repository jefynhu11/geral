package com.jeferson.reports.report2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    @BeforeMethod
    public static void setUp() {
        ExtentReport.initReports();
    }

    @AfterMethod
    public static void tearDown() throws IOException {
        ExtentReport.flushReports();
    }
}
