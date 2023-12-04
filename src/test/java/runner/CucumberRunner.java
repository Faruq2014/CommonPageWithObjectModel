package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin={"pretty",
		"html:target/CucumberReport.html",
		"json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-report.xml"
		},

features="src/test/resources/features",
glue="steps",
tags="@facebook",
snippets=SnippetType.CAMELCASE
		
		)
public class CucumberRunner {

}
