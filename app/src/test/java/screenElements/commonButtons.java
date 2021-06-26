package screenElements;


//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import screenElements.Screen;

import java.util.HashMap;
import java.util.Set;

public class commonButtons  extends Screen {

//    public static AppiumDriver<MobileElement> driver;

    public commonButtons(){
        // HashMap constructed by String, Webelement
        // for the moment since I can't create the driver properly
        // but it can be substituted for appium element later

        elements = new HashMap<>();
        //LoginScreen
        elements.put("Sign In", By.xpath("Sign In element"));


    }
}
