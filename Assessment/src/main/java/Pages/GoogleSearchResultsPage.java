package Pages;

import PageElements.GoogleSearchResultsPageElements;
import Utilities.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultsPage extends WebActions {
    private GoogleSearchResultsPageElements elements= new GoogleSearchResultsPageElements();
    public GoogleSearchResultsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,elements);
    }
    public String getSearchResults(){
            goToURL("https://www.bing.com/");
            enterTextWithEnter(elements.searchBox,"Artificial Intelligence");
            return getTitleOfCurrentPage();
    }
}
