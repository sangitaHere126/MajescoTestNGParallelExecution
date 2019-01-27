package Runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(
		// features = "src/main/resources/Feature//apta_NYL.feature",//the path
		// of the feature files
		features = "src/main/resources/Features/",

		glue = { "StepDef" }, // the path of the step definition files

		monochrome = true, // display the console output in a proper readable
							// format
		strict = true, // it will check if any step is not defined in step
						// definition file

		// plugin =
		// {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		plugin = { "pretty", "html:target/cucumber-html-report" }, dryRun = false, // to
																					// check
																					// the
																					// mapping
																					// is
																					// proper
																					// between
																					// feature
																					// file
																					// and
																					// step
																					// def
																					// file

		// tags = {"@AptaRegression_3"}
		tags = { "@xmlPdf" }
// @AbeRegression_1_6,@AbeRegression_8,@AbeRegression_1_9,@AbeRegression_1_10,@AbeRegression_1_11,@AbeRegression_13,@AbeRegression_15,@AbeRegression_16,@AbeRegression_17,@AbeRegression_18,@AbeRegression_19,@AbeRegression_20,@AbeRegression_21,@AbeRegression_22,@AbeRegression_23,@AbeRegression_24"}

// mvn -Dcucumber.options="--tags @AptaRegression_1" clean install
// mvn clean test -Dtest=TestRunner
// mvn -Dtest=TestRunner -Dcucumber.options="--tags @AptaRegression_3" clean
// install
// mvn clean install -Dtest=TestRunner -Dcucumber.options="--tags
// @AptaRegression_3"

)

public class TestNgRunnerTest extends AbstractTestNGCucumberTests {

	// private TestNGCucumberRunner testNGCucumberRunner;

	// public WebDriver driver;

	@BeforeSuite
	public void messageBeforeSuite() {
		System.out.println("beforSuite");

	}

	@AfterSuite
	public void messageAfterSuite() {
		System.out.println("afterSuite");

	}
}
/*
 * public static void clearExcel() throws IOException {
 * 
 * System.out.println("This is me");
 * 
 * 
 * } //@AfterSuite public static void pdfAndxmlCom() throws InterruptedException
 * { System.out.println("This is End");
 * System.out.println("***********************************");
 * //restExe.xmlAndpdfComparison(scenario);
 * System.out.println("***********************************");
 */
// }

// ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as
// @SmokeTest OR @RegressionTest
// ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests
// tagged as @SmokeTest AND @RegressionTest
