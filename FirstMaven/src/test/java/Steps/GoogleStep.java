package Steps;

import Base.AutomationBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GooglePage;

public class GoogleStep extends AutomationBase {

    //public WebDriver driver;

    public GoogleStep(){}



    GooglePage googlePage = new GooglePage(getWebDriver());

    @Given("launch the browser")
    public void launch_the_browser() {
        //System.setProperty("webdriver.chrome.driver","C://drivers//chromedriver.exe");
        //driver = new ChromeDriver();
        //driver = new ChromeDriver();
    }

    @When("open google page")
    public void open_google_page() {
        webDriver.get("https://www.google.co.in/");
    }

    @Then("user should see text box")
    public void user_should_see_text_box() throws InterruptedException {
        Thread.sleep(10);
        //Assert.assertTrue("Not displayed",driver.findElement(By.name("q")).isDisplayed());
        Assert.assertTrue("Not displayed",googlePage.isSearchTextDisplayed());
        //driver.quit();
    }

}