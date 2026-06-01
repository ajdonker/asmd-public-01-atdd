package calculator;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }
    @When("I multiply {int} and {int}")
    public void i_multiply_and(int arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the product should be {int}")
    public void the_product_should_be(int int1) {
        // Write code here that turns the phrase above into concrete actions
        this.calculator.multiply();
        if(int1 != this.calculator.getResult()){
            throw new IllegalStateException();
        }
    }

    @When("I divide {int} and {int}")
    public void i_divide_and(int int1, int int2) {
        // Write code here that turns the phrase above into concrete actions
        this.calculator.enter(int1);
        this.calculator.enter(int2);
    }
    @Then("the quotient should be {int}")
    public void the_quotient_should_be(int int1) {
        // Write code here that turns the phrase above into concrete actions
        this.calculator.divide();
        if(int1 != this.calculator.getResult()) {
            throw  new IllegalStateException();
        }
    }

}
