package stepDefinition;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screenElements.LoginPage;
import screenElements.ScreenInterface;
import methods.multipleMethods;

import static driver.driverMethods.driver;
import static driver.driverMethods.startdriver;

public class LoginSteps {

//    public static AppiumDriver<MobileElement> driver;
    private ScreenInterface loginScreen = new LoginPage();
    private WebDriverWait wait = new WebDriverWait(driver, 30);
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

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(loginScreen.getEleLocator("Login Header")));
         String title =ele.getText();

        Assert.assertEquals(title, "LoginTest");


    }

    @Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void enterCredentials(String user, String pword) throws Throwable {


            WebElement ele;

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

    //This snippet could go in a commonsteps definition
    @And("^User sees the \"([^\"]*)\" button as \"([^\"]*)\"$")
    public void seeButtonStatus(String button, String status) throws Throwable {
        WebElement ele;
        boolean state = false;

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(loginScreen.getEleLocator(button+" element")));

        if (status.equalsIgnoreCase("Enabled")){
            state = true;
        }

        Assert.assertEquals(state, ele.isEnabled());

    }

    //This snippet could go in a commonsteps definition
    @And("^User clicks on \"([^\"]*)\" button$")
    public void clickButton(String button) throws Throwable {
        WebElement ele;

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(loginScreen.getEleLocator(button+" element")));
        ele.click();
    }


}
