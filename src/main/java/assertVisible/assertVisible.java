package assertVisible;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class assertVisible extends assertXpath {

    WebDriver webDriver;
    WebElement fiyat1;
    WebElement fiyat2;
    String a;
    String b;
    public assertVisible(WebDriver driver)
    {

        this.webDriver = driver;
    }
    public Boolean FiyatKiyaslama() throws Exception
    {

        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        fiyat1 = wait.until(ExpectedConditions.visibilityOfElementLocated(urunDetayFiyat));
        a=fiyat1.getText();
        return fiyat1.isDisplayed();
    }
    public Boolean FiyatKiyaslama2()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        fiyat2 = wait.until(ExpectedConditions.visibilityOfElementLocated(urunSepetFiyat));
        b=fiyat2.getText();
        return fiyat2.isDisplayed();
    }
    public void FiyatKiyaslamaXXX() //throws Exception
    {
        System.out.println("a degeri "+a);
        System.out.println("b degeri "+b);
        Assert.assertEquals(a,b);
    }
}
