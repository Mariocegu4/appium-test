package driver;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;


@RunWith(ExtendedCucumber.class)
@CucumberOptions(features={"src/test/Features/test.feature"}
        //for some reason glue is not finding steps
        ,glue ={"stepDefinitions"}
        ,tags={"@test"}
        ,plugin = {"pretty"}
        ,dryRun= false)

public class TestRuns {

//    @Before
//    methods

//    @After
//    methods


}
