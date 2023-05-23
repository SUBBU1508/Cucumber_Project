package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileWorking {
	@Given("Get the mobile")
	public void get_the_mobile() {
	    System.out.println("PURCHASE NEW MOBILE");
	}

	@When("switch on power button")
	public void switch_on_power_button() {
		System.out.println("SWITCH ON THE MOBILE");
	}

	@Then("Display the screen")
	public void display_the_screen() {
		System.out.println("TO DISPLAY THE MOBILE WITH EXISTING APPS");
	}

	@When("click on the dial keypad")
	public void click_on_the_dial_keypad() {
		System.out.println("TO CLICK THE KEYPAD APP ON MOBILE");
	}

	@Then("open the keypad")
	public void open_the_keypad() {
		System.out.println("NOW ITS OPEN KEYPAD AND READY FOR TYPING THE NUMBER");
	}

	@When("Type the numbers")
	public void type_the_numbers() {
		System.out.println("NOW TYPE THE NUMBER FOR RECEIVER");
	}

	@When("click on the dial option")
	public void click_on_the_dial_option() {
		System.out.println("AFTER TYPING CLICK ON SEND BUTTON");
	}

	@Then("call farward to correspond mobile")
	public void call_farward_to_correspond_mobile() {
		System.out.println("NOW CALL IS FARWARD TO CORRESPONDING PERSON");
	}

	@Then("Ringing")
	public void ringing() {
		System.out.println("RINGING TO CORRESPONDING RECEIVER MOBILE");
	}
	@When("Click on any one of the app")
	public void click_on_any_one_of_the_app() {
		System.out.println("TO SELECT ANY MOBILE APP TO CLICK ON IT");
	}

	@Then("To display that app")
	public void to_display_that_app() {
		System.out.println("TO DISPLAY CORRESPONDING MOBILE APP");
	}
}
