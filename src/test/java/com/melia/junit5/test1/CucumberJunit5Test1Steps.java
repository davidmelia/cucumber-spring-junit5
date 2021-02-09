package com.melia.junit5.test1;



import static org.junit.jupiter.api.Assertions.assertEquals;

import com.melia.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@CucumberContextConfiguration
@SpringBootTest
public class CucumberJunit5Test1Steps {
  @Autowired
  private ApplicationContext ctx;
  private Calculator calc;

  @Given("^a junit 5 test 1 calculator I just turned on$")
  public void setup() {
    calc = ctx.getBean(Calculator.class);
  }

  @When("^I add (\\d+) and (\\d+)$")
  public void add(int arg1, int arg2) {
    calc.push(arg1);
    calc.push(arg2);
    calc.push("+");
  }

  @When("^I substract (\\d+) to (\\d+)$")
  public void substract(int arg1, int arg2) {
    calc.push(arg1);
    calc.push(arg2);
    calc.push("-");
  }

  @Then("^the result is (\\d+)$")
  public void the_result_is(double expected) {
    assertEquals(expected, calc.value());
  }

}
