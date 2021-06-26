package screenElements;


//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Set;

public class LoginPage  extends Screen{

//    public static AppiumDriver<MobileElement> driver;

    public LoginPage(){
        // HashMap constructed by String, Webelement
        // for the moment since I can't create the driver properly
        // but it can be substituted for appium element later

        elements = new HashMap<>();

            elements.put("Login Header", By.xpath("Login Header element"));
            elements.put("Username", By.xpath("User Name element"));
            elements.put("Password", By.xpath("Password element"));
            elements.put("Sign In", By.xpath("Sign In element"));


    }
}
