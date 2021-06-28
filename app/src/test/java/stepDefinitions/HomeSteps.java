package stepDefinitions;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screenElements.HomePage;
import screenElements.ScreenInterface;
import methods.multipleMethods;
import static driver.driverMethods.driver;

public class HomeSteps {

//    public static AppiumDriver<MobileElement> driver;
     private ScreenInterface home =new HomePage();



    @When("^User is presented in the Home Screen$")
    public void userHomePage() throws Throwable{
        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 15);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(home.getEleLocator("MainActivity Header")));
        String title =ele.getText();

        Assert.assertEquals(title, "LoginTest");


    }

    @When("^Check if Email is present$")
    public void emailHomePage() throws Throwable{
        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 15);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(home.getEleLocator("Email Element")));
        String email =ele.getText();

        Assert.assertEquals(email,  multipleMethods.email);


    }

}
