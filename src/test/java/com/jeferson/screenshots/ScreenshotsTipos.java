package com.jeferson.screenshots;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.jeferson.arquivos.CreateFolder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ScreenshotsTipos {

    private static final String PATH_PHOTO = System.getProperty("user.dir") + File.separator + "report" + File.separator + "photo";

    /** Screenshot na pagina **/
    public static void screenshotas(WebDriver driver) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Jeferson\\Desktop\\OUTROS\\teste.png"));
    }

    /** Screenshot parte no elemento da pagina **/
    public static void screenshotElement(WebElement element) throws IOException {
        File file = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("photo.png"));
    }

    /** Screenshot completo na pagina com dependencia (qatools.ashot) **/
    public static void screenshotFullPage(WebDriver driver) throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "PNG", new File("teste.png"));

    }

    /** Com dependencia (aventstack) screenshot na pagina **/
    public static MediaEntityModelProvider screenshot(WebDriver driver) throws IOException {
        CreateFolder.createDirectory(PATH_PHOTO);

        File photo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String path = PATH_PHOTO + File.separator + photo.getName();

        FileUtils.copyFile(photo, new File(path));

        return MediaEntityBuilder.createScreenCaptureFromPath(path).build();
    }

    /** Screenshot usa para bit report (acho)**/
    public static MediaEntityModelProvider screenshotBase64(WebDriver driver){
        try {
            CreateFolder.createDirectory(PATH_PHOTO);
            return MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)).build();
        }catch (Exception e){

        }
        return null;
    }


}
