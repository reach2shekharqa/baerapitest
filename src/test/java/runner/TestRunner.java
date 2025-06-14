package runner;

// import org.junit.runner.RunWith;
// import io.cucumber.junit.Cucumber;
// import io.cucumber.junit.CucumberOptions;

// @RunWith(Cucumber.class)
// @CucumberOptions(
//     features = "src/test/java/resources/features",
//     glue = {"stepdefs"},
//     plugin = {"pretty", "html:target/cucumber-report.html"},
//     monochrome = true
// )

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // This maps to: src/test/resources/features
@ConfigurationParameter(key = "cucumber.glue", value = "stepdefs")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-report.html")
// @ConfigurationParameter(key = "cucumber.plugin", value = "pretty,timeline:target/timeline-report")

public class TestRunner {

}
