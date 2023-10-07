package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
//@CucumberOptions(tags="@all")
//@CucumberOptions(plugin= {"html:target/cucumberReport.html"},tags="@login")
@CucumberOptions(plugin= {"html:target/cucumberReport.html"})
public class MyRunner {

	
}
