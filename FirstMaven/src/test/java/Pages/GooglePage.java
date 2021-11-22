package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {


    public GooglePage(WebDriver webdriver) {
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver, this);
    }

    WebDriver webdriver;

    @FindBy(how = How.NAME, using = "q")
    public WebElement txtSearch;


    public boolean isSearchTextDisplayed() {
        boolean isDisplayed = txtSearch.isDisplayed();
        return isDisplayed;
    }
}
