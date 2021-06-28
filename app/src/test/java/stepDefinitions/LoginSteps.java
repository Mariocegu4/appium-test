package stepDefinitions;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screenElements.LoginPage;
import screenElements.ScreenInterface;
import methods.multipleMethods;

import static driver.driverMethods.driver;

public class LoginSteps {

//    public static AppiumDriver<MobileElement> driver;
    private ScreenInterface loginScreen = new LoginPage();
//            Then User is presented in the Home Screen

    @Given("^The user enters the app for scenario \"(.*)\"$")
    public void startApp(String scenario) throws Throwable {
        //        startdriver();

        //    This snippet could also be used to initialize documentation (PDF w/ Scenario name)
        //    to add screenshots
    }


    @When("^The user is presented to the login screen$")
    public void userLoginIn() throws Throwable{
        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 15);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(loginScreen.getEleLocator("Login Header")));
         String title =ele.getText();

        Assert.assertEquals(title, "LoginTest");


    }

    @Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void enterCredentials(String user, String pword) throws Throwable {


        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        //Generate or establish an Email
        if(user.equalsIgnoreCase("Gen")) {
//            Generate email method

        }else{
                multipleMethods.setEmail(user);
        }

        //Generate or establish a Password
        if (pword.contains("Gen")){
            multipleMethods.genPassword(pword);
        }else{
            multipleMethods.setPassword(pword);
        }

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(loginScreen.getEleLocator("User Name element")));
        ele.sendKeys(multipleMethods.email);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(loginScreen.getEleLocator("Password element")));
        ele.sendKeys(multipleMethods.password);
    }

}
