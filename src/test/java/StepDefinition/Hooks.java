package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void Start() {
		System.out.println("started the execution");
	}
	
	@After
	public void Stop() {
		System.out.println("Ended the execution");
	}

}
