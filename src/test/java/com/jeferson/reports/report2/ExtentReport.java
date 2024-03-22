package com.jeferson.reports.report2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ExtentReport {

    private ExtentReport() {
    }

    private static ExtentReports extent;
    public static ExtentTest test;

    public static void initReports() {

//        String caminho = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "html-config.xml";

        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); //html file will be generated
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Report test");
            spark.config().setReportName("Automation Practice");
//---------------------------------------------------------------------------------
            /** OU especifico para XML **/
//            final File CONF = new File(caminho);
//            spark.loadXMLConfig(CONF);
            /** 29 ou 32 **/
//        spark.loadXMLConfig(new File(caminho));
// ---------------------------------------------------------------------------------
            extent.attachReporter(spark);
        }
    }

    public static void flushReports() throws IOException {
        if (Objects.nonNull(extent)) {
            extent.flush();
        }
        Desktop.getDesktop().browse(new File("index.html").toURI());
    }

    public static void createTest(String testCaseName) {
        test = extent.createTest(testCaseName);
    }
}
