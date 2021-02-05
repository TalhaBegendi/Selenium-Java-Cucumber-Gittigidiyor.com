package assertVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class assertBaseClass extends assertXpath {


    WebDriver webDriver;
    WebElement element;
    String textDetayFiyat,textSepetFiyat;
    Boolean elementCount;

    public assertBaseClass(WebDriver driver)
    {
        this.webDriver = driver;
    }
    public void ElementVisible(By Element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
    }
    public void ElementCount(By Element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementCount = wait.until(ExpectedConditions.invisibilityOfElementLocated(Element));
    }
}
