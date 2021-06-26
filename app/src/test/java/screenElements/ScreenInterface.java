package screenElements;

import org.openqa.selenium.By;

import java.util.Set;

public interface ScreenInterface {

    public Set<String> getAllElementsName();
    public By getEleLocator(String name);

}
