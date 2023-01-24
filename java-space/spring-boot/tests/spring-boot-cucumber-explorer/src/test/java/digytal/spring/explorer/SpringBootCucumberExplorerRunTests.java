package digytal.spring.explorer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty", "json:target/cucumber-report.json"})
@TestPropertySource(locations="classpath:test.properties")
class SpringBootCucumberExplorerRunTests {


}
