package StepDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {

	@Before()
	public void startTest(Scenario scenario) {
		System.out.println("This is before scenario" + scenario.getName());

	}

	@After()
	public void endTest(Scenario scenario) {

		System.out.println("This is after scenario" + scenario.getName());
	}
}