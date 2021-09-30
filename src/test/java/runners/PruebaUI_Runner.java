package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src/test/resources/features/PruebaUI.feature",
		glue = "stepdefinitions",
		tags = "",
		snippets = SnippetType.CAMELCASE)

public class PruebaUI_Runner {

	
}