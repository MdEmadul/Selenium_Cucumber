package Runner_File;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		//tags = "@Smoketest",
		
		features = {"src/test/resources/Features_files/Login_ba.feature"}, // needs to mention here package name+file name

		glue = { "Steps_File" }, // needs to mention here only steps package name(no java file name)
		monochrome = true, 
		dryRun = false

		

)

public class Test_Login_Runner {

}
