package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/java/features"},
		glue= {"Steps", "Hooks"},
		plugin= {"pretty"}
		)




public class My_Runner {
	

}


