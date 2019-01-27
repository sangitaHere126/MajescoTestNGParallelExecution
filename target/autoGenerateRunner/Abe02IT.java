import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"E:/Majesco/Testng/src/main/resources/Features/Abe.feature:5"},
        plugin = {"json:E:/Majesco/Testng/target/cucumber-parallel/json/2.json", "rerun:E:/Majesco/Testng/Reports/cucumber-parallel/2.txt"},
        monochrome = true,
        glue = {"StepDef"})
public class Abe02IT extends AbstractTestNGCucumberTests {
}
