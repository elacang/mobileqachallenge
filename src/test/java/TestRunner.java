import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@test"},
        plugin = {"pretty",
                "html:target/test-report/cucumber-html-report",
                "json:target/test-report/cucumber-json-report/cucumber.json",
                "junit:target/test-report/cucumber-junit-report/cucumber-junit.xml"},
        snippets = SnippetType.CAMELCASE
)
public class TestRunner {

}
