import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import

public class Tests {



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
                        "configs.extentreports"+File.separator+
                        "spark.config.xml";
        report = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.loadXMLConfig(configPath);
        sparkReporter.config().setReportName("Sample Extent Report");
        report.setSystemInfo("Project", "TDL Summer School");
        report.setSystemInfo("Author","Nils Grintals");
        report.attachReporter(sparkReporter);

    }

    @Test(description = "Testing the create a user functionality")
    public void createAUser() {
        openUrl();
    }


    @AfterClass
    public static void endTest(){
        report.flush();
    }
}

}
