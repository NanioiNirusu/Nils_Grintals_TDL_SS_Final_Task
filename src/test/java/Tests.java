import Pages.AccordionAndTabsPage;
import Pages.DialogBoxesPage1;
import Pages.DialogBoxesPage2;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.Objects.Button;

import java.io.File;
import java.io.IOException;
import Pages.HomePage;


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
        DialogBoxesPage1 dialogBoxesPage1 = new DialogBoxesPage1();
        if(dialogBoxesPage1.isInitialized())
        {
            test.log(Status.INFO, "Home page is visible");
        }
        else
        {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        dialogBoxesPage1.createAnAccount.click();
        DialogBoxesPage2 dialogBoxesPage = new DialogBoxesPage2();
        dialogBoxesPage.dialogBoxesPage2();



    }

    @Test(description = "Validate second section")
    public void validate2Section() {
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
        homePage.tabs.click();
        AccordionAndTabsPage accordionAndTabsPage = new AccordionAndTabsPage();
        if(accordionAndTabsPage.isInitialized())
        {
            test.log(Status.INFO, "Home page is visible");
        }
        else
        {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        accordionAndTabsPage.choose2Section.click();


    }
    @AfterClass
    public static void endTest(){
//        report.flush();
    }
}


