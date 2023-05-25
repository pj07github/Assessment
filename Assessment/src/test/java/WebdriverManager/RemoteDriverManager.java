package WebdriverManager;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.*;

public class RemoteDriverManager {
    public static WebDriver driver;
    @BeforeClass
    public void setupBrowser(ITestContext context){
        String browser= context.getCurrentXmlTest().getParameter("browser");
        if(browser.equals("chrome")){
        WebDriverManager.chromedriver().setup();
        ChromeOptions option= new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }


}
