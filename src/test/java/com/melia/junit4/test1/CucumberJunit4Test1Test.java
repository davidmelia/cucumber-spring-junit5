package com.melia.junit4.test1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/melia/junit4/test1", plugin = {"pretty", "html:target/cucumber"})
public class CucumberJunit4Test1Test {

}
