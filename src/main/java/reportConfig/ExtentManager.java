package reportConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import commons.GlobalConstants;

	public class ExtentManager {
		public static final ExtentReports extentReports = new ExtentReports();

		public synchronized static ExtentReports createExtentReports() {
			ExtentSparkReporter reporter = new ExtentSparkReporter(GlobalConstants.PROJECT_PATH + "/report-ExtentV5/ExtentReport.html");
			reporter.config().setReportName("SETEL HTML Report");
			reporter.config().setDocumentTitle("SETEL HTML Report");
			reporter.config().setTimelineEnabled(true);
			reporter.config().setEncoding("utf-8");
			reporter.config().setTheme(Theme.DARK);

			extentReports.attachReporter(reporter);
			extentReports.setSystemInfo("Company", "SETEL");
			extentReports.setSystemInfo("Project", "SETEL AMAZON & EBAY");
			extentReports.setSystemInfo("QA", "Yuna TL");
			extentReports.setSystemInfo("JDK version", GlobalConstants.JAVA_VERSION);
			return extentReports;
		}
	}


