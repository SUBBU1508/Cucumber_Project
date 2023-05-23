package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class lift_demo {
	@Given("go to lift")
	public void go_to_lift() {

		System.out.println("Person go to lift location");
	}

	@When("click on open button")
	public void click_on_open_button() {
		System.out.println("CLICK THE OPEN BUTTON(UP OR DOWN");
	}

	@Then("open the doors")
	public void open_the_doors() {
		System.out.println("OPEN THE DOORS");
	}

	@When("click on floor number button {int}")
	public void click_on_floor_number_button(Integer int1) {
	    System.out.println("CLICK THE FLOOR NUMBER"+int1);
	}

	@Then("close the doors")
	public void close_the_doors() {
		System.out.println("CLOSE THE DOORS");
	}

	@Then("lift go to given number floor")
	public void lift_go_to_given_number_floor() {
		System.out.println("LIFT TO GO TO REQUIRED FLOOR AND OPEN THE DOORS");
	}

}
