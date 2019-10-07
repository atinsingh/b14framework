package co.pragra.testingframework.reports;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.nio.file.Path;
import java.nio.file.Paths;

public class HtmlReport {
    private static ExtentHtmlReporter reporter;
    private static ExtentReports reports;

    private HtmlReport() {
        Path path = Paths.get("report.html");
        reporter = new ExtentHtmlReporter(path.toFile());
        reports = new ExtentReports();
        reports.attachReporter(reporter);
    }

    public static ExtentReports getReportInstance(){
        if(reporter==null){
            new HtmlReport();
        }
        return reports;
    }
}
