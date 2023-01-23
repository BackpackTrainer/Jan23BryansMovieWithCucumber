package com.barclays.movies.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinitions {

    @Given("a simple given step")
    public void a_simple_given_step() {
        System.out.println("The given step worked");
    }
    @When("a simple when step")
    public void a_simple_when_step() {
        System.out.println("The when step worked");
    }
    @Then("a simple then step")
    public void a_simple_then_step() {
        System.out.println("The then step worked");
    }

    @Given("I have {int} pears")
    public void i_have_pears(Integer int1) {
        System.out.println("I have " + int1 + " pears");
    }
    @When("I write {string}")
    public void i_write(String fruit) {
        System.out.println("I am eating " + fruit);
    }
    @Then("I eat {int} pear and write {string}")
    public void i_eat_pear_and_write(Integer int1, String fruit) {
        System.out.println("I have " + int1 + " " + fruit + " left");
    }
}
