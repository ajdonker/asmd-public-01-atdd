package a06.sol2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemoryGameSteps {
    private Logic logic;
    @When("I hit position {int} {int}")
    public void iHitPosition(int arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        this.logic.hit(new Position(arg0, arg1));
    }

    @Given("a board with values")
    public void aBoardWithValues(DataTable table) {
        // Write code here that turns the phrase above into concrete actions
        Map<Position, Integer> values = new HashMap<>();
        table.asMaps().forEach(row -> {
            int x = Integer.parseInt(row.get("x"));
            int y = Integer.parseInt(row.get("y"));
            int value = Integer.parseInt(row.get("value"));

            values.put(new Position(x, y), value);
        });
        this.logic = new LogicImpl(values);
    }

    @Then("position {int} {int} should be temporarily {int}")
    public void positionShouldBeTemporarily(int arg0, int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg2, this.logic.temporary(new Position(arg0,arg1)).orElseThrow());
    }

    @And("position {int} {int} should not be found")
    public void positionShouldNotBeFound(int arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(this.logic.found(new Position(arg0, arg1)).isEmpty());
    }

    @Then("position {int} {int} should be found with value {int}")
    public void positionShouldBeFoundWithValue(int arg0, int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg2, this.logic.found(new Position(arg0, arg1)).orElseThrow());
    }

    @Then("position {int} {int} should be hidden")
    public void positionShouldBeHidden(int arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(this.logic.temporary(new Position(arg0, arg1)).isEmpty());
        assertTrue(this.logic.found(new Position(arg0, arg1)).isEmpty());
    }

    @Then("the game should be over")
    public void theGameShouldBeOver() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(this.logic.isOver());
    }
}
