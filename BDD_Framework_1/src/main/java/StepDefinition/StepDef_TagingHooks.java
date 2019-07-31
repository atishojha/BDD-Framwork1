package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDef_TagingHooks {
	
@Before
public void Browser_launch() {
	System.out.println("Browser have been launch successfully");	
}
@After
public void Browser_close() {
	System.out.println("Browser have been closed");	
}
/*@Before("@Smoke")
public void Browser_launch_new() {
	System.out.println("Browser have been launch_new successfully");	
}
@After("@Smoke")
public void Browser_close_new() {
	System.out.println("Browser have been closed_new");	
}
*/
	
	@Given("^Example one for TagingHooks$")
	public void example_one_for_TagingHooks() {
	    System.out.println("Execution have completed for example one");
	}

	@Given("^Example two for TagingHooks$")
	public void example_two_for_TagingHooks() {
		System.out.println("Execution have completed for example two");
	}

	@Given("^Example three for TagingHooks$")
	public void example_three_for_TagingHooks() {
		System.out.println("Execution have completed for example three");
	}

	@Given("^Example four for TagingHooks$")
	public void example_four_for_TagingHooks() {
		System.out.println("Execution have completed for example four");
	}
}
