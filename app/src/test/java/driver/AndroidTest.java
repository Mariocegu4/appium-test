package driver;


//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Capabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidTest {



//    public static AppiumDriver<MobileElement> driver;

    public static DesiredCapabilities cap;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "io.grainchain.logintest");
        cap.setCapability("appActivity", "io.grainchain.logintest.ui.login.LoginActivity");

//        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723"), cap);
        Thread.sleep(3000);



    }
}