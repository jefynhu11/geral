package com.jeferson.reports.report1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public static void setUp() {
        ReportFw1.configurarExtentReport();
    }

    @AfterMethod
    public static void tearDown() {
        ReportFw1.closeReport();
    }

}
