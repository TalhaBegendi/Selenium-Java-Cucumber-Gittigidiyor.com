package assertVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assertBaseClass {


    WebDriver webDriver;
    WebElement fiyat1;
    WebElement fiyat2;

    public assertBaseClass(WebDriver driver)
    {
        this.webDriver = driver;
    }
    public void ElementVisible(By Element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        fiyat1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
    }
    public void ElementVisible2(By Element)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        fiyat2 = wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
    }
}
