package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private final String url="https://www.globalsqa.com/demo-site/";

    private ConfigFileReader configFileReader = new ConfigFileReader();


    private static WebDriver driver;


    public WebDriver getDriver(){
        if(this.driver==null){
            System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        return this.driver;
    }

    public ConfigFileReader getConfig()
    {
        return this.configFileReader;
    }

    public void openUrl(){
        getDriver().get(url);

    }
}
