package PageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResultsPageElements {

    @FindBy(xpath = "//*[@placeholder='Search the web']")
    public WebElement searchBox;
}
