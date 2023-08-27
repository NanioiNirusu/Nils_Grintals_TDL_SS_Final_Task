package common;

import Pages.DialogBoxesPage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private final String url="https://www.globalsqa.com/demo-site/";

    private ConfigFileReader configFileReader = new ConfigFileReader();


    private static WebDriver driver;


    public WebDriver getDriver()
    {
        if(this.driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--load-extension=C:\\extensions\\uBlock-Origin");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return this.driver;
    }

    public WebDriver switchDriver(String locator){
        driver.switchTo().frame(driver.findElement(By.cssSelector(locator)));
        return driver;
    }

    public WebDriver returnCommonDriver(){
        getDriver().switchTo().defaultContent();
        return driver;

    }

    public ConfigFileReader getConfig()
    {
        return this.configFileReader;
    }

    public void openUrl(){
        getDriver().get(url);

    }

    public WebElement getWebElement(String locator)
    {

        if(locator.startsWith("id="))
        {
            String idLocator = locator.substring(3);
            return getDriver().findElement(By.id(idLocator));
        }
        else if(locator.startsWith("name="))
        {
            String nameLocator = locator.substring(5);
            return getDriver().findElement(By.name(nameLocator));
        }
        else if(locator.startsWith("xpath="))
        {
            String xpathLocator = locator.substring(6);
            return getDriver().findElement(By.xpath(xpathLocator));
        }

        else if(locator.startsWith("class="))
        {
            String classLocator = locator.substring(6);
            return getDriver().findElement(By.className(classLocator));
        }



//        }
        else if(locator.startsWith("css="))
        {
            String cssLocator = locator.substring(4);
            return getDriver().findElement(By.cssSelector(cssLocator));
        }
        else
        {
            throw new IllegalArgumentException("Invalid locator: " + locator);
        }
    }


}
