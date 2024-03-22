package com.jeferson.reports.report1;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.jeferson.screenshots.ScreenshotsTipos;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.ashot.Screenshot;

public class TestCase {

    public void test() {
        ReportFw.createTest("Teste");
//        ReportFw.extentTest.log(Status.PASS, "Teste passou", ScreenshotsTipos.screenshot(driver));
//        ReportFw.extentTest.pass("Passou", MediaEntityBuilder.createScreenCaptureFromBase64String(path).build());
    }

}
