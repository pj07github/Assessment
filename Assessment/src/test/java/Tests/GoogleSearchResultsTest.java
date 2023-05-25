package Tests;

import Pages.GoogleSearchResultsPage;
import WebdriverManager.RemoteDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearchResultsTest extends RemoteDriverManager {
    SoftAssert softAssert = new SoftAssert();
    GoogleSearchResultsPage page;

    @Test
    public void findResults() {
        page = new GoogleSearchResultsPage(driver);
        String title= page.getSearchResults();
        softAssert.assertTrue(title.equalsIgnoreCase("Artificial Intelligence - Search"));
    }
}
