package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class WebActions {
    public static WebDriver driver;
    public WebActions(WebDriver driver){
        this.driver=driver;
    }
    public List<WebElement> getAllElements(String id){
        return driver.findElements(By.id(id));
    }
    public void clickElement(WebElement ele, int timeInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
    }
    public void goToURL(String URL){
        driver.get(URL);
    }
    public static void captureScreenShot() throws IOException {
        File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File(System.getProperty("user.dir")+"/src/test/resources/Screenshots");
        FileUtils.copyFileToDirectory(sourceFile, destFile);
    }

    public void enterTextWithEnter(WebElement ele, String text){
        ele.sendKeys(text);
        ele.submit();
    }
    public String getTitleOfCurrentPage(){
        return driver.getTitle();
    }

}
