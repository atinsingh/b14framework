package co.pragra.testingframework.listeners;

import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.reports.HtmlReport;
import co.pragra.testingframework.utils.FrameWorkUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ScreenShotListener implements ITestListener {
    private final Logger logger = LogManager.getLogger(ScreenShotListener.class);
    private final ExtentReports reports = HtmlReport.getReportInstance();
    private ExtentTest test;
    @Override
    public void onTestStart(ITestResult iTestResult) {
       test = reports.createTest(iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        test.log(Status.PASS, iTestResult.getName() + "Passed!");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.log(Level.ERROR, "Test Failed {} - Doing Screenshot now", iTestResult.getName());
        FrameWorkUtils.takeScreenShot(DriverManager.getWebDriver(),iTestResult.getName());
        test.log(Status.FAIL, iTestResult.getName() + "Got Failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
