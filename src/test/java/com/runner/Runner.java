package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"./Features"},
		glue = "com.stepdefinition",
		plugin= {"pretty","json:target/cucumber.json" },
		tags = {"@Regression"} 
		
		)





public class Runner extends AbstractTestNGCucumberTests {

}
