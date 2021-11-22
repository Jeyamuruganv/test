package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationBase {

    protected WebDriver webDriver;

    public WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        webDriver = new ChromeDriver();
        return webDriver;
    }
}

