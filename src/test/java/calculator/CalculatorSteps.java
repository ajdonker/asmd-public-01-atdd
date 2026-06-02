package calculator;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;
    private Exception exception;
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
        try {
            this.calculator.divide();
        }
        catch (Exception e) {
            this.exception = e;
        }
    }
    @Then("the quotient should be {int}")
    public void the_quotient_should_be(int int1) {
        // Write code here that turns the phrase above into concrete actions
        if(int1 != this.calculator.getResult()) {
            throw  new IllegalStateException();
        }
    }
    @Then("an IllegalArgumentException should be thrown")
    public void anIllegalArgumentExceptionShouldBeThrown() {
        assertNotNull(exception);
        assertInstanceOf(IllegalArgumentException.class, exception);
    }

    @When("I exp {int} and {int}")
    public void iExpAnd(int arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        try {
            this.calculator.exp();
        } catch (Exception e) {
            this.exception = e;
        }
    }

    @Then("I get {int}")
    public void iGet(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        if(arg0 != this.calculator.getResult()) {
            throw new IllegalStateException();
        }
    }
}
