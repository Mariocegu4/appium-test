package screenElements;

import org.openqa.selenium.By;

import java.util.Map;
import java.util.Set;

abstract class Screen implements  ScreenInterface{

    protected Map<String, By> elements;

    public By getEleLocator(String name){
         return elements.get(name);
     }

}
