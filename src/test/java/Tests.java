import Pages.*;
import Pages.Objects.Link;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.TestBase;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.Objects.Button;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Tests extends TestBase{

    private WebDriver driver;
    static ExtentReports report;

    @BeforeClass
    public static void startTest() throws IOException {
        String reportPath =
                "src"+ File.separator+
                        "main" + File.separator+
                        "resources" + File.separator+
                        "reports" + File.separator+
                        "TestReport.html";
        String configPath=
                "src"+File.separator+
                        "main" + File.separator+
                        "resources" + File.separator+
                        "configs"+File.separator+
                        "extentreports"+File.separator+
                        "spark-config.xml";
        report = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.loadXMLConfig(configPath);
        sparkReporter.config().setReportName("Sample Extent Report");
        report.setSystemInfo("Project", "TDL Summer School");
        report.setSystemInfo("Author","Nils Grintals");
        report.attachReporter(sparkReporter);

    }

    @Test(description = "Testing the 'create a user' functionality")
    public void createAUser() {
        ExtentTest test = report.createTest("Testing the Extent Reporter");
        test.log(Status.INFO, "The test is started");
        openUrl();
        HomePage homePage = new HomePage();
        if(homePage.isInitialized())
        {
            test.log(Status.INFO, "Home page is visible");
        }
        else
        {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        homePage.dialogBox.click();
//        GoogleVignette googleVignette = new GoogleVignette();
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].style.display = 'none';", clickClose);
//        googleVignette.clickClose.click();

        DialogBoxesPage1 dialogBoxesPage1 = new DialogBoxesPage1();

        switchDriverCss("iframe[data-src*='modal-form.html']");
        if(dialogBoxesPage1.isInitialized())
        {
            test.log(Status.INFO, "DialogBoxes1 page is visible");
        }
        else
        {
            test.log(Status.INFO, "DialogBoxes1 page is NOT visible");
        }
        dialogBoxesPage1.createAnAccount.click();
        DialogBoxesPage2 dialogBoxesPage = new DialogBoxesPage2();
        dialogBoxesPage.dialogBoxesPage2();
        Assert.assertTrue(dialogBoxesPage1.isInitialized2());
        returnCommonDriver();



    }

    @Test(description = "Validate second section")
    public void validate2Section() {
        ExtentTest test = report.createTest("Testing the second section validation");
        test.log(Status.INFO, "The test is started");
        openUrl();
        HomePage homePage = new HomePage();
        if (homePage.isInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        homePage.tabs.click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.tabs.click();

        AccordionAndTabsPage accordionAndTabsPage = new AccordionAndTabsPage();
        switchDriverClass("demo-frame lazyloaded");
        if (accordionAndTabsPage.isInitialized()) {
            test.log(Status.INFO, "AccordionAndTabs page is visible");
        } else {
            test.log(Status.INFO, "AccordionAndTabs page is NOT visible");
        }
        accordionAndTabsPage.choose2Section.click();

    }

    @Test(description = "RGB value converter")
    public void rgbConverter() {
        ExtentTest test = report.createTest("Testing the RGB value convertion");
        test.log(Status.INFO, "The test is started");
        openUrl();
        HomePage homePage = new HomePage();
        if(homePage.isInitialized())
        {
            test.log(Status.INFO, "Home page is visible");
        }
        else
        {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        homePage.progressBar.click();
        ProgressBarPage progressBarPage = new ProgressBarPage();
        if (progressBarPage.isInitialized1()) {
            test.log(Status.INFO, "AccordionAndTabs page is visible");
        } else {
            test.log(Status.INFO, "AccordionAndTabs page is NOT visible");
        }
        progressBarPage.chooseRPB.click();

        progressBarPage.randomColour.click();

        progressBarPage.randomDeterminate.click();


    }

    @AfterClass
    public static void endTest(){
//        report.flush();
    }
}


