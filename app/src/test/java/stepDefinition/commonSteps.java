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
import screenElements.commonButtons;

import static driver.driverMethods.driver;
import static driver.driverMethods.startdriver;

public class commonSteps {

    //    public static AppiumDriver<MobileElement> driver;
    private ScreenInterface common = new commonButtons();
    private WebDriverWait wait = new WebDriverWait(driver, 30);



    @And("^User sees the \"([^\"]*)\" button as \"([^\"]*)\"$")
    public void seeButtonStatus(String button, String status) throws Throwable {
        WebElement ele;
        boolean state = false;

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(common.getEleLocator(button+" element")));

        if (status.equalsIgnoreCase("Enabled")){
            state = true;
        }

        Assert.assertEquals(state, ele.isEnabled());

    }

    @And("^User clicks on \"([^\"]*)\" button$")
    public void clickButton(String button) throws Throwable {
        WebElement ele;

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(common.getEleLocator(button+" element")));
        ele.click();
    }


}
