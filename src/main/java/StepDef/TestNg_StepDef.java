package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestNg_StepDef {
	WebDriver driver;
	WebDriver driver1;
	WebDriver driver2;

	@Given("^Test set up for xml and pdf$")
	public void scnario1Step() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//libs//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("stepDefinition step for first scenario");

	}

	@When("^required url is opened$")
	public void scnario1OpenBrowser() throws InterruptedException {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("test");
		Thread.sleep(10000);
		driver.quit();

	}

	@Given("^Test set up for second feature file$")
	public void scnario2Step() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//libs//chromedriver.exe");
		driver1 = new ChromeDriver();
		// Thread.sleep(60000);
		System.out.println("stepDefinition step for second feature");

	}

	@When("^we get another url$")
	public void scnario2OpenBrowser() throws InterruptedException {
		driver1.get("https://portfolio.rediff.com/portfolio-login");
		//driver1.findElement(By.name("q")).sendKeys("test");
		System.out.println("step two for first scenario second feature completed");
		Thread.sleep(10000);
		driver1.quit();

	}

	@Given("^required url is opened for second scenario$")
	public void scnario3PdfXmlOpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//libs//chromedriver.exe");
		driver2 = new ChromeDriver();
		driver2.get("https://google.com");
		driver2.findElement(By.name("q")).sendKeys("test");
		Thread.sleep(10000);
		System.out.println("scenario2 for PDFXML scenario completed");
		driver2.quit();

	}

	@Given("^print$")
	public void fromFeatures1Folder() {
		System.out.println("plain print");

	}

}
