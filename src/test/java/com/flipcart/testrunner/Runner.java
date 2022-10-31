package com.flipcart.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = { "src\\test\\java\\com\\flipcart\\Features"}
,glue={"com.flipcart.StepDefinition"}
,monochrome=true
,plugin= {"pretty","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"} //to generate different types of reporting
)
public class Runner {

}


