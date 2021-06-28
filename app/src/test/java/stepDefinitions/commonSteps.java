package stepDefinitions;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screenElements.ScreenInterface;
import screenElements.commonButtons;

import static driver.driverMethods.driver;

public class commonSteps {

    //    public static AppiumDriver<MobileElement> driver;
    private ScreenInterface common = new commonButtons();


    @Given("^Cucumber execution print a line$")
    public void testCucumber(){
        System.out.println("-------CUCUMBER IS OPERATIONAL-------");
    }

    @And("^User sees the \"([^\"]*)\" button as \"([^\"]*)\"$")
    public void seeButtonStatus(String button, String status) throws Throwable {
        WebElement ele;
        WebDriverWait wait = new WebDriverWait(driver, 15);
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
        WebDriverWait wait = new WebDriverWait(driver, 15);

        ele = wait.until(ExpectedConditions.
                presenceOfElementLocated(common.getEleLocator(button+" element")));
        ele.click();
    }


}
