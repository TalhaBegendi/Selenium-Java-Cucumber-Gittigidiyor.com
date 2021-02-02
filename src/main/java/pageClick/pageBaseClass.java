package pageClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageBaseClass extends pageXpaths {

    WebDriver webDriver;
    WebElement elementClick;
    WebElement elementSendKey;

    public pageBaseClass(WebDriver driver)
    {
        this.webDriver = driver;
    }
    public void ElementClick(By Element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementClick = wait.until(ExpectedConditions.elementToBeClickable(Element));
        elementClick.click();
    }
    public void ElementSendkey(By element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        elementSendKey = wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
