package com.flipcart.testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = { "src\\test\\java\\com\\flipcart\\Features\\ApplicationSignIn.feature"}
,glue={"com.flipcart.StepDefinition"}
,monochrome=true
//,dryRun=false
,plugin= {"pretty","json:target/cucumber.json"} //to generate different types of reporting
)
public class Runner {

}


