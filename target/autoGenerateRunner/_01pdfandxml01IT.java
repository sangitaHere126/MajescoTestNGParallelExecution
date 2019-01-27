import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"E:/Majesco/Testng/src/main/resources/Features/01pdfAndXml.feature:5"},
        plugin = {"json:E:/Majesco/Testng/target/cucumber-parallel/json/1.json", "rerun:E:/Majesco/Testng/Reports/cucumber-parallel/1.txt"},
        monochrome = true,
        glue = {"StepDef"})
public class _01pdfandxml01IT extends AbstractTestNGCucumberTests {
}
