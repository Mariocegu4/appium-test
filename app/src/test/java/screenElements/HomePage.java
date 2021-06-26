package screenElements;


//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Set;

public class HomePage  extends Screen{

//    public static AppiumDriver<MobileElement> driver;

    public HomePage(){
        // HashMap constructed by String, Webelement
        // for the moment since I can't create the driver properly
        // but it can be substituted for appium element later

        elements = new HashMap<>();

        elements.put("Home Header", By.xpath("MainActivity element"));
        elements.put("Email", By.xpath("Email element"));


    }
}
