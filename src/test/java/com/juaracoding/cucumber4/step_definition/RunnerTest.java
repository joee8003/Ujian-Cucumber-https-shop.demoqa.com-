package com.juaracoding.cucumber4.step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:/target/cucumber-report"},
		features = {"src/main/resources/features/"}
		)
public class RunnerTest {

}
